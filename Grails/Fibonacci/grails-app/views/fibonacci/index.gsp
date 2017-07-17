<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title><g:message code="seqFibo"/></title>
</head>

<body>
    <div id="list" class="content scaffold-list" role="main">
        <h1><g:message code="seqFibo"/></h1>

        <table>
            <thead>
                <tr>
                    <g:each in="${(1..n).toList()}" var="c">
                        <th>${c}</th>
                    </g:each>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <g:each in="${lista}" var="fibo">
                        <td>${fibo}</td>
                    </g:each>
                </tr>
            </tbody>
        </table>
    </div>
</body>
</html>