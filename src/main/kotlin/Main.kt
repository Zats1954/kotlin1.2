import java.util.*

fun main(){
    val number1 = Scanner(System.`in`)
    print("Введите число лайков: ")
    val likes = number1.nextInt()
    val lastDigit = likes % 10
    val word = if(lastDigit == 1 && likes != 11){" человеку"} else {     " людям"   }
    print("Понравилось $likes $word")
}