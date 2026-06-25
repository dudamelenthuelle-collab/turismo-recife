function calculadora(num1, num2, operacao) {
    switch (operacao) {
        case 1:
            return num1 + num2;
        case 2:
            return num1 - num2;
        case 3:
            return num1 * num2;
        case 4:
            if (num2 === 0) {
                return "Erro: divisão por zero";
            }
            return num1 / num2;
        default:
            return 0;
    }
}