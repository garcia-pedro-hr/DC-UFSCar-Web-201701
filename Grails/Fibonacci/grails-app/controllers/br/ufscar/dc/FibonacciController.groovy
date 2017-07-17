package br.ufscar.dc

class FibonacciController {

    def index() {
        def n

        if (!params.n) {
            n = 15
        } else {
            n = Integer.parseInt(params.n)
        }

        int[] list = new int[n]

        for (i in (0..(n-1)).step(1))
            list[i] = Fibonacci.fibo(i)

        render view: 'index', model: [lista: list, n: n]
    }
}
