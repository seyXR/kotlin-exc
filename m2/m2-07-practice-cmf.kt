// fun main()
// {
//     // initalise Player objects
// val P1 = Player("Nicola", "Tesla")
// val P2 = Player("Thomas", " Edison " )
// // create working variables
// val scoring = Scores()  // instance of the Scores class to allow access to checkBest function
// var lvlScore= 0 // variable to simulate Player level score

// // Level 1
// lvlScore = 12 // insert simulated values for level score
// P1.totalScore += lvlScore; // use the combined operator (+=) to add the lvlScore to totalScore
// // suppy the parameters for the checkBest function by accessing the Player properties
// P1.personalBestScore = scoring.checkBest(P1.personalBestScore,lvlScore);

// lvlScore = 34
// P2.totalScore += lvlScore;
// P2.personalBestScore = scoring. checkBest(P2.personalBestScore,lvlScore);

// // Level 2
// lvlScore = 56 // insert simulated values for level score
// P1.totalScore += lvlScore; // use the combined operator (+=) to add the lvlScore to totalScore
// // suppy the parameters for the checkBest function by accessing the Player properties
// P1.personalBestScore = scoring.checkBest(P1.personalBestScore,lvlScore);

// lvlScore = 78 // insert simulated values for level score
// P2.totalScore += lvlScore;
// P2.personalBestScore = scoring. checkBest(P2.personalBestScore,lvlScore);

// // Level 3
// lvlScore = 99 // insert simulated values for level score
// P1.totalScore += lvlScore; // use the combined operator (+=) to add the lvlScore to totalScore
// // suppy the parameters for the checkBest function by accessing the Player properties
// P1.personalBestScore = scoring.checkBest(P1.personalBestScore,lvlScore);

// lvlScore = 10
// P2.totalScore += lvlScore;
// P2.personalBestScore = scoring.checkBest(P2.personalBestScore,lvlScore);

// // conditional check using an if statement to determine the winner
// if(P1.totalScore > P2.totalScore)
// {
// // access the Player properties to construct the String to print
// println("The winner is "+ P1.fullName() +  " with a Score of  "+P1.totalScore);
// println("Personal Best Score is = " +P1.personalBestScore);
// }
// else
// {
// println("The winner is "+ P2.fullName() + " with a Score of "+P2.totalScore);
// println("Personal Best Score is = " +P2.personalBestScore);
// }
// }

// Clase Player para almacenar el nombre, apellido, puntuación total y mejor puntuación personal
class Player(var name: String, var surName: String) {
    var totalScore = 0
    var personalBestScore = 0

    // Función para obtener el nombre completo del jugador
    fun fullName(): String {
        return "$name $surName"
    }
}

// Clase Scores con función para determinar la mejor puntuación
class Scores {
    fun checkBest(best: Int, current: Int): Int {
        return if (best < current) current else best
    }
}

fun main() {
    // Inicialización de objetos Player
    val P1 = Player("Nicola", "Tesla")
    val P2 = Player("Thomas", "Edison")

    // Instancia de la clase Scores para acceder a la función checkBest
    val scoring = Scores()

    // Simulación de puntuaciones por nivel y actualización de datos
    // Nivel 1
    var lvlScore = 12
    P1.totalScore += lvlScore
    P1.personalBestScore = scoring.checkBest(P1.personalBestScore, lvlScore)

    lvlScore = 34
    P2.totalScore += lvlScore
    P2.personalBestScore = scoring.checkBest(P2.personalBestScore, lvlScore)

    // Nivel 2
    lvlScore = 56
    P1.totalScore += lvlScore
    P1.personalBestScore = scoring.checkBest(P1.personalBestScore, lvlScore)

    lvlScore = 78
    P2.totalScore += lvlScore
    P2.personalBestScore = scoring.checkBest(P2.personalBestScore, lvlScore)

    // Nivel 3
    lvlScore = 99
    P1.totalScore += lvlScore
    P1.personalBestScore = scoring.checkBest(P1.personalBestScore, lvlScore)

    lvlScore = 10
    P2.totalScore += lvlScore
    P2.personalBestScore = scoring.checkBest(P2.personalBestScore, lvlScore)

    // Determinar el ganador y mostrar los resultados
    val winner = if (P1.totalScore > P2.totalScore) P1 else P2
    println("The winner is ${winner.fullName()} with a Score of ${winner.totalScore}")
    println("Personal Best Score is = ${winner.personalBestScore}")
}
