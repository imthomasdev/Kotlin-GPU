fun main() {
    println(
        """
        Digite a marca da sua placa de vídeo, exemplo: NVIDIA OU AMD
    """.trimIndent()
    )
    val pergunta = readlnOrNull()
    when (pergunta?.lowercase()) {
        "nvidia" -> {
            println("Show, sua placa de vídeo é da marca Nvidia, agora digite o numero da sua placa ")
            println("So temos informações no momento até a RTX 3060.")
            val questNvidia = readlnOrNull()
            when (questNvidia?.lowercase()) {
                "rtx 4090" -> println("A RTX 4090 Tem 100.00 de Desempenho e 450W De TDP")
                "rtx 4080" -> println("A RTX 4080 Tem 89.49 de Desempenho e 320W De TDP")
                "rtx 4070" -> println("A RTX 4070 Tem 69.85 de Desempenho e 285W de TDP")
                "rtx 4060" -> println("A RTX 4060 Tem 50.64 de Desempenho e 115W de TDP")
                "rtx 3090" -> println("A RTX 3090 Tem 69.29 de Desempenho e 350W de TDP")
                "rtx 3080" -> println("A RTX 3080 tem 65.41 de Desempenho e 320W de TDP")
                "rtx 3070" -> println("a RTX 3070 Tem 57.91 de Desempenho e 220W de TDP")
                "rtx 3060" -> println("a RTX 3060 Tem 44.16 de Desempenho e 170W de TDP")
            }
        }
    }
    when (pergunta?.lowercase()) {
        "amd" -> {
            println("Show sua placa de video é da AMD, agora digite o modelo da sua placa")
            println("temos informações no momento até a RX 6600")
            val questAMD = readlnOrNull()
            when (questAMD?.lowercase()) {
                "rx 7900 xtx" -> println("A RX 7900 XTX Tem 79.95 de Desempenho e 355W de TDP")
                "rx 7900 xt" -> println("A RX 7900 XT Tem 74.42 de Desempenho e 315W de TDP")
                "rx 6950 xt" -> println("A RX 6950 XT Tem 73.24 de Desempenho e 335W de TDP")
                "rx 6900 xt" -> println("A RX 6900 XT Tem 69.44 de Desempenho e 300W de TDP")
                "rx 6800 xt" -> println("A RX 6800 XT Tem 64.71 de Desempenho e 300W de TDP")
                "rx 7800 xt" -> println("A RX 7800 XT Tem 62.06 de Desempenho e 263W de TDP")
                "rx 6800" -> println("A RX 6800 Tem 57.66 de Desempenho e 250W de TDP")
                "rx 7700 XT" -> println("A RX 7700 XT Tem 56.98 de Desempenho e 245W de TDP")
                "rx 6750 xt" -> println("A RX 6750 XT Tem 53.68 de Desempenho e 250W de TDP")
                "rx 6700 xt" -> println("A RX 6700 XT XTX Tem 79.95 de Desempenho e 230W de TDP")
                "rx 6700" -> println("A RX 6700 XTX Tem 48.41 de Desempenho e 175W de TDP")
                "rx 7600 xt" -> println("A RX 7600 XT Tem 44.79 de Desempenho e 190W de TDP")
                "rx 6650 xt" -> println("A RX 6650 XT Tem 44.68 de Desempenho e 176W de TDP")
                "rx 5700 xt" -> println("A RX 5700 XT Tem 43.03 de Desempenho e 225W de TDP")
                "rx 6600 xt" -> println("A RX 6600 XT Tem 42.58 de Desempenho e 160W de TDP")
                "rx 7600" -> println("A RX 7600 Tem 42.14 de Desempenho e 165W de TDP")
                "rx 6600" -> println("A RX 6600 Tem 39.10 de Desempenho e 132W de TDP")
                else -> {
                    println("Algo deu errado, tente novamente!")
                }
            }
        } else -> println("Algo deu errado, tente novamente!")
    }
}
