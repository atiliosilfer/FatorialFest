fun main() {

    var fatorial: Int

    println("Digite um número: ")
    var entrada = readLine()!!.toInt()


    fatorial = fatorial(entrada)

    println("O fatorial de $entrada é $fatorial!")
}

fun fatorial(n : Int): Int {
    var fat : Int
    if(n == 0){
        fat = 1
    }else{
        fat = n * (fatorial(n-1))
    }
    return fat
}

