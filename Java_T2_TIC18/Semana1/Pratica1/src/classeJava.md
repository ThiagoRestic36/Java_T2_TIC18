# **O que é uma classe em Java e qual é a diferença entre uma classe e um objeto? Dê 5 exemplos mostrando-os em C++ e em Java.**

Em Java, uma classe é um modelo para criar objetos. Ela define os atributos e comportamentos que todos os objetos desse tipo terão.

A diferença entre uma classe e um objeto é que a classe é um modelo, enquanto o objeto é uma instância concreta da classe. Um objeto é criado a partir de uma classe, e ele possui todos os atributos e comportamentos definidos na classe.

# Exemplo 1

***C++***

>Classe `Retangulo`:
```c++ 
class Retangulo {
public:
    double comprimento;
    double largura;
    double calcularArea() {
        return comprimento * largura;
    }
};
```
>Objeto `retangulo:` 
``` c++
Retangulo retangulo;
retangulo.comprimento = 5;
retangulo.largura = 3;
cout << retangulo.calcularArea() << endl;
``` 

***Java***
```java

public class Retangulo {
    private double comprimento;
    private double largura;

    public double calcularArea() {
        return comprimento * largura;
    }
}

Retangulo retangulo = new Retangulo();
retangulo.setComprimento(5);
retangulo.setLargura(3);
System.out.println(retangulo.calcularArea());
```

# Exemplo 2 
***C++***

>Classe `Livro`:
```c++
class Livro {
public:
    string titulo;
    string autor;
    int anoPublicacao;
     void imprimir() {
      cout << "titulo: " << titulo << endl;
      cout << "autor: " << autor << endl;
      cout << "anoPublicacao: " << anoPublicacao << endl;
    }
};
```
>Objeto `Livro:` 
``` c++
Livro livro;
livro.titulo = "Aventuras de Sherlock Holmes";
livro.autor = "Arthur Conan Doyle";
livro.anoPublicacao = 1892;
Livro.Imprimir();
``` 
***Java***
```java
public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public void imprimir() {
        System.out.println("titulo: " + titulo);
        System.out.println("autor: " + autor);
        System.out.println("anoPublicacao: " + anoPublicacao);
    }
}


Livro livro = new Livro();
livro.setTitulo("Aventuras de Sherlock Holmes");
livro.setAutor("Arthur Conan Doyle");
livro.setAnoPublicacao(1892);
livro.imprimir();
```

# Exemplo 3

***C++***
>Classe `Circulo`:
```c++
class Circulo {
  public:
    int raio;
    double x;
    double y;
    double calcularArea() {
      return 3.14 * raio * raio;
    }
};
```
>Objeto `Circulo:` 
``` c++
Circulo circulo;
circulo.raio = 30;
circulo.x = 0;
circulo.y = 0;
cout << circulo.calcularArea() << endl;
``` 
***Java***
```java
public class Circulo {
    private int raio;
    private double x;
    private double y;

    public double calcularArea() {
        return 3.14 * raio * raio;
    }
}


Circulo circulo = new Circulo();
circulo.setRaio(30);
circulo.setX(0);
circulo.setY(0);
System.out.println(circulo.calcularArea());
```

# Exemplo 4 
***C++***

>Classe `Estudante`:
```c++ 
class Estudante {
public:
    string nome;
    int idade;
    double nota;
};
    void imprimir() {
      cout << "noem: " << nome << endl;
      cout << "idade: " << idade << endl;
      cout << "nota: " << nota << endl;
    }
```
>Objeto `Estudante:` 
``` c++
Estudante estudante;
estudante.nome = "João";
estudante.idade = 20;
estudante.nota = 8.5;
Estudante.Imprimir();
``` 
***Java***
```java
public class Estudante {
    private String nome;
    private int idade;
    private double nota;

    public void imprimir() {
        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("nota: " + nota);
    }
}

Estudante estudante = new Estudante();
estudante.setNome("João");
estudante.setIdade(20);
estudante.setNota(8.5);
estudante.imprimir();
```

# Exemplo 5
***C++***

>Classe `Triangulo`:
``` c++
class Triangulo {
public:
    double base;
    double altura;
    double calcularArea() {
        return 0.5 * base * altura;
    }
};

```
>Objeto `Triangulo:` 
``` c++
Triangulo triangulo;
triangulo.base = 8;
triangulo.altura = 5;
cout << triangulo.calcularArea() << endl;
``` 
***Java***
```java

public class Triangulo {
    private double base;
    private double altura;

    public double calcularArea() {
        return 0.5 * base * altura;
    }
}

Triangulo triangulo = new Triangulo();
triangulo.setBase(8);
triangulo.setAltura(5);
System.out.println(triangulo.calcularArea());
```
<hr>