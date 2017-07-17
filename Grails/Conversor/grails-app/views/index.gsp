<!DOCTYPE html>
<html>
<head>
    <title><g:message code="seqCF"/></title>
</head>

<body>
    <div class="content scaffold-create" role="main">

        <h2><g:message code="celsius"/> --> <g:message code="fahrenheit"/></h2>

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

        <h2><g:message code="quilos"/> --> <g:message code="libras"/></h2>

        <g:form controller="QL">

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