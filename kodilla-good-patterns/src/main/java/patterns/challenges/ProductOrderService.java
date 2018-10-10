package patterns.challenges;



public class ProductOrderService {
    private InformationService informationService;
    private RentalService rentalService;
    private RentalRepository rentalRepository;

    public ProductOrderService(final InformationService informationService,
                               final RentalService rentalService,
                               final RentalRepository rentalRepository) {
        this.informationService = informationService;
        this.rentalService = rentalService;
        this.rentalRepository = rentalRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean rent = rentalService.rented(orderRequest.getUser(), orderRequest.getGame(),
                orderRequest.getRental());

        if(rent) {
            informationService.inform(orderRequest.getUser());
            rentalRepository.createOrder(orderRequest.getUser(), orderRequest.getGame(), orderRequest.getRental());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
