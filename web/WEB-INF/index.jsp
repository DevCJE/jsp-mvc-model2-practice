<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
  web-inf폴더안의 index.jsp입니다
  <div class="switch-controller">
    <div>
      <button onclick="location.href='subContext.do?location=1'">1번으로 이동</button>
    </div>
    <div>
      <button onclick="location.href='subContext.do?location=2'">2번으로 이동</button>
    </div>
  </div>
  </body>
</html>
/