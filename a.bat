@echo on
call gradlew build
pause
git add *
git commit -m %1