
import kotlinx.coroutines.*;

fun main(){
    print("Iniciando cocina inteligente. ")

    GlobalScope.launch {

        delay(2000)

        println("Cocinar arroz")

        delay(1500)
        println("Freír papas")

        delay(1000)
        println("Preparar jugo")
    }

    println("Preparando la mesa...")

    Thread.sleep(5000)

    println("Cocina completa")
}
