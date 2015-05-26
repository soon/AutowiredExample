<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
<ul>
    <c:forEach var="city" items="${cities}">
        <ul>${city.name}</ul>
    </c:forEach>
</ul>
</body>
</html>