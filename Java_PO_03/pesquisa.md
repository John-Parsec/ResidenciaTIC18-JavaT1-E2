# Questão01:

Em Java, uma exceção é um evento que ocorre durante a execução de um programa e que interrompe o fluxo normal de instruções. Essas situações excepcionais podem ocorrer devido a erros no código, condições imprevistas ou comportamentos inesperados do sistema.

O propósito principal de usar exceções em programas Java é lidar com essas situações excepcionais de uma maneira controlada e estruturada. Em vez de simplesmente permitir que o programa falhe abruptamente quando encontra um problema, as exceções permitem que possamos implementar mecanismos para lidar com essas situações e, se possível, continuar a execução do programa de uma maneira controlada.

exemplo de exceção:
try {
    // código sujeito a exceções
} catch (SomeException e) {
    // código para lidar com a exceção
} finally {
    // código a ser executado sempre
}


# Questão02

Exceções Verificadas (Checked Exceptions):

São subclasses diretas da classe Exception, exceto subclasses de RuntimeException.
Obriga o programador a lidar com essas exceções explicitamente, seja através de um bloco try-catch ou declarando no cabeçalho do método que a exceção pode ser lançada usando a cláusula throws.
Exemplos de exceções verificadas incluem IOException, FileNotFoundException, SQLException, entre outras.


Exceções Não Verificadas (Unchecked Exceptions):

São subclasses diretas de RuntimeException ou Error.
O programador não é obrigado a lidar explicitamente com essas exceções. No entanto, ainda é possível fazê-lo se desejado.
Exemplos de exceções não verificadas incluem NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException, entre outras.

# Questão03 e Questão04

Try, Catch e Finally:
 O código que pode gerar uma exceção é colocado dentro do bloco try, e o código para lidar com a exceção é colocado dentro do bloco catch.
O bloco finally é opcional e é usado para conter código que deve ser executado independentemente de ocorrer ou não uma exceção no bloco try.

try {
    // código sujeito a exceções
} catch (TipoDeExcecao1 e1) {
    // código para lidar com TipoDeExcecao1
} catch (TipoDeExcecao2 e2) {
    // código para lidar com TipoDeExcecao2
} finally {
    // código a ser executado sempre
}


Throw e Throws:
A palavra-chave throw é usada para explicitamente lançar uma exceção em um bloco de código.
A palavra-chave throws é usada no cabeçalho de um método para declarar que o método pode lançar uma exceção específica, transferindo a responsabilidade do tratamento para o chamador.

throw new MinhaExcecao("Isso é uma exceção!");

public void meuMetodo() throws MinhaExcecao {
    // código que pode lançar MinhaExcecao
}

Múltiplos Catch:
Um bloco try pode ter vários blocos catch para lidar com diferentes tipos de exceções.
A ordem dos blocos catch é importante, pois o primeiro bloco cujo tipo de exceção coincide com a exceção lançada é o único que será executado.
try {
    // código sujeito a exceções
} catch (Excecao1 e) {
    // código para lidar com Excecao1
} catch (Excecao2 e) {
    // código para lidar com Excecao2
}

# Questão05

Criar nossas próprias exceções personalizadas em Java pode ser apropriado em situações em que as exceções existentes na biblioteca padrão não são suficientes para representar problemas específicos do nosso codigo. Isso permite nos fornecer um contexto mais significativo sobre o motivo da exceção e torne o código mais legível e compreensível.


![Screenshot from 2023-11-30 19-42-33](https://github.com/mikaelle1992/.Net/assets/64756228/c24c12e4-3ec6-487a-9492-6691471839b4)
