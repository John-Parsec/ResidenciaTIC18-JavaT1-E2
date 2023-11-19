### 1. O que é uma classe em Java e qual é a diferença entre uma classe e um objeto? Dê 5 exemplos mostrando-os em C++ e em Java.

> R: Uma classe é um modelo que define um conjunto de atributos e métodos comuns a um determinado grupo de objetos. Um objeto é uma instância de uma classe. Um objeto é uma variável que armazena uma referência a um objeto da classe. Em C++ uma classe é definida com a palavra reservada class e em Java com a palavra reservada class. Em C++ um objeto é definido com a palavra reservada new e em Java com a palavra reservada new.

>Exemplos:
>C++
```
//Classe
    class Pessoa {
        private:
            string nome;
            int idade;
        public:
            Pessoa(string nome = "", int idade = 0) {
                this->nome = nome;
                this->idade = idade;
            }
            string getNome() {
                return nome;
            }
            int getIdade() {
                return idade;
            }
    };

//Objetos
    Pessoa p1("João", 20);
    Pessoa p2;
```
>Java
```
//Classe
    public class Pessoa {
        private String nome;
        private int idade;
        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }
        public String getNome() {
            return nome;
        }
        public int getIdade() {
            return idade;
        }
    }
Objeto
    Pessoa p1 = new Pessoa("João", 20);
```


### 2. Como você declara uma variável em Java e quais são os tipos de dados primitivos mais comuns? Faça um paralelo entre isso e a mesma coisa na linguagem C++

> R: Em Java uma variável é declarada com a palavra reservada var. Os tipos de dados primitivos mais comuns são: int, float, double, char, boolean. Em C++ uma variável é declarada com a palavra reservada auto. Os tipos de dados primitivos mais comuns são: int, float, double, char, bool.
