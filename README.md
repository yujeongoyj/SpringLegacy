# SpringLegacy
스프링 레거시에 thymeleaf추가 하는법

mvn레포지토리 에서
thymeleaf
thymeleaf spring6
를 pom에 추가

디스패처.xml로 가서
templateResolver 빈을 만들어 준다.
이후
templateEngine, ThymeleafViewResolver 빈 두개를 만들어 준다.
그리고 서버 시작해서 에러 확인함
WEB-INF에서 templates 폴더 만들고 index html파일 생성