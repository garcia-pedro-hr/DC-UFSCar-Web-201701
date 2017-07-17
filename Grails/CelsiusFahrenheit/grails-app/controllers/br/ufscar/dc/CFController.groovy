package br.ufscar.dc

class CFController {

    def index() {

        def minValue, maxValue, incValue

        if (!params.minValue) {
            minValue = -100
        } else {
            minValue = Integer.parseInt(params.minValue)
        }

        if (!params.maxValue) {
            maxValue = 100
        } else {
            maxValue = Integer.parseInt(params.maxValue)
        }

        if (!params.incValue) {
            incValue = 5
        } else {
            incValue = Integer.parseInt(params.incValue)
        }

        List<CelsiusFahrenheit> list = new ArrayList<>()

        for (i in (minValue..maxValue).step(incValue)) {
            def cf = new CelsiusFahrenheit();
            cf.setCelsius(i)
            list.add(cf)
        }

        render view: "index", model: [lista: list]
    }
}
