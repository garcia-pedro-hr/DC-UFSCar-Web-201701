<!DOCTYPE html>
<html>
<head>
    <title><g:message code="seqFibo"/></title>
</head>

<body>

    <h1><g:message code="seqFibo"/></h1>

    <div id="form" class="content scaffold-create" role="main">

        <g:form controller="Fibonacci">

            <fieldset class="buttons">

                <label for="n">
                    n
                </label>
                <g:field name="n" type="number" value="1" min="1"/>

                <g:submitButton name="OK" class="OK" value="OK"/>
            </fieldset>
        </g:form>
    </div>
</body>
</html>
