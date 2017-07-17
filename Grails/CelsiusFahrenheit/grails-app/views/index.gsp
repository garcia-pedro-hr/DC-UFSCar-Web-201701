<!DOCTYPE html>
<html>
<head>
    <title><g:message code="seqCF"/></title>
</head>

<body>
<div id="form" class="content scaffold-create" role="main">

    <g:form controller="CF">

        <fieldset class="buttons">

            <label for="minValue">
                <g:message code="minValue"/>
            </label>
            <g:field name="minValue" type="number" value="0" min="-200"/>

            <label for="maxValue">
                <g:message code="maxValue"/>
            </label>
            <g:field name="maxValue" type="number" value="0" max="200"/>

            <label for="incValue">
                <g:message code="incValue"/>
            </label>

            <g:select name="incValue" from="${['5', '10']}"/>

            <g:submitButton name="OK" class="OK" value="OK"/>
        </fieldset>
    </g:form>
</div>
</body>
</html>
