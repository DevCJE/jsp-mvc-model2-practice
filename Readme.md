오늘부터 그 동안 우격다짐으로 넣어져 있던 개념들을 다시 정리할 겸
아래와 같은 순서대로 개념을 다시 정리하고 포트폴리오를 작성해보고자 합니다

1. JSP Model 1 (3일 예상)
2. JSP Model 2 (3일 예상)
3. Spring MVC Project (4일 예상)
4. Spring Boot Project (3일 예상)
5. 이후 포트폴리오 페이지 구상
6. 포트폴리오 Project (1달 예상)


해당 1-6번까지 전부 약 2달안에는 끝내는 방식으로 진행해보고자 한다.
이후에 프로젝트 부분이 끝날때 마다 해당 프로젝트 md 파일에 위와 같이 업데이트 내역을 업로드 할 예정.

1번과 2번을 먼저 하는 이유는 MVC 모델을 다시 이해하고 흘러가는 사이클을 알아보고자 함이고
이후에는 주로 쓰이는 스프링을 이용하여 웹 프로젝트를 구축하여 보고
이를 이용하여서 포트폴리오 페이지를 작성하는것에 의의가 있다.


* 2월 28일
    * JSP MVC Model2를 통한 웹페이지 연습
         ***
         
         model1 과는 다르게 jsp에 있는 java 코드를 controller단으로 이동해서
         model view controller를 깔끔하게 분리해놓은것이 mvc model2이다.
         
         다만 위와 같이 설정해주기 위해서는 servlet을 설정해줘야 하며
         컨트롤러에서는 HttpServlet을 상속받아 doGet, doPost에서 처리 로직을 구현한뒤
         RequestDispatcher를 이용하여 원하는 view 객체로 forward 해주게 된다.
         
         ***