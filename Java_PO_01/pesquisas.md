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

### 3. Explique o conceito de herança em Java e como você pode criar uma subclasse a partir de uma classe existente. Faça um paralelo com C++, apresentando 5 exemplos.

### Herança em Java:

>A herança em Java é um conceito fundamental na programação orientada a objetos, que permite a criação de uma classe (subclasse) que herda características e comportamentos de outra classe (superclasse). A subclasse pode então estender ou especializar a superclasse, adicionando ou modificando comportamentos.

*Para criar uma subclasse em Java, você usa a palavra-chave extends. Aqui está um exemplo simples:*

```Java
// Superclasse
class Animal {
    void fazerSom() {
        System.out.println("Algum som");
    }
}

// Subclasse que herda de Animal
class Cachorro extends Animal {
    void fazerSom() {
        System.out.println("Latindo");
    }

    void correr() {
        System.out.println("Correndo como um cachorro");
    }
}
```

### Herança em C++:

>Em C++, a herança é implementada de maneira semelhante. A palavra-chave class é usada tanto para superclasse quanto para subclasse, e a herança é indicada usando : seguido do modo de acesso (public, private, protected).
 
### *Aqui estão cinco exemplos em C++:*

#### Exemplo 1: Herança Pública

```c++
class Animal {
public:
    void fazerSom() {
        cout << "Algum som" << endl;
    }
};

class Cachorro : public Animal {
public:
    void fazerSom() {
        cout << "Latindo" << endl;
    }

    void correr() {
        cout << "Correndo como um cachorro" << endl;
    }
};
```

#### Exemplo 2: Herança Protegida
```c++
class Veiculo {
protected:
    int velocidade;
};

class Carro : protected Veiculo {
public:
    void acelerar() {
        velocidade += 10;
        cout << "Acelerando. Velocidade: " << velocidade << " km/h" << endl;
    }
};
```

#### Exemplo 3: Herança Privada
```c++
class Pessoa {
private:
    string nome;
public:
    Pessoa(string n) : nome(n) {}

    void saudacao() {
        cout << "Olá, eu sou " << nome << endl;
    }
};

class Estudante : private Pessoa {
public:
    Estudante(string n) : Pessoa(n) {}

    void estudar() {
        cout << "Estudando muito!" << endl;
    }
};
```

#### Exemplo 4: Herança Múltipla
```c++
class A {
public:
    void mostrarA() {
        cout << "Classe A" << endl;
    }
};

class B {
public:
    void mostrarB() {
        cout << "Classe B" << endl;
    }
};

class C : public A, public B {
public:
    void mostrarC() {
        cout << "Classe C" << endl;
    }
};
```

#### Exemplo 5: Construtores e Destrutores em Herança
```c++
class Animal2 {
public:
    Animal2() {
        cout << "Construtor Animal2" << endl;
    }

    ~Animal2() {
        cout << "Destrutor Animal2" << endl;
    }
};

class Cachorro2 : public Animal2 {
public:
    Cachorro2() {
        cout << "Construtor Cachorro2" << endl;
    }

    ~Cachorro2() {
        cout << "Destrutor Cachorro2" << endl;
    }
};
```

### Estes exemplos ilustram diferentes aspectos da herança em C++, incluindo herança pública, protegida e privada, herança múltipla e o uso de construtores e destrutores em herança.

