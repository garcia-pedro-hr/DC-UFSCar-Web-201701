<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title><g:message code="seqCF"/></title>
</head>

<body>

<div id="list" class="content scaffold-list" role="main">
    <h1><g:message code="seqCF"/></h1>

    <table>
        <thead>
        <tr>

            <th><g:message code="celsius"/></th>

            <th><g:message code="fahrenheit"/></th>

        </tr>
        </thead>
        <tbody>
        <g:each in="${lista}" status="i" var="instance">
            <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

                <td>${instance.celsius}</td>
                <td>${fieldValue(bean: instance, field: "fahrenheit")}</td>

            </tr>
        </g:each>
        </tbody>
    </table>
</div>
</body>
</html>