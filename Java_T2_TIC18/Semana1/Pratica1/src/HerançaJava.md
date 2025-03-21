# **Explique o conceito de herança em Java e como você pode criar uma subclasse a partir de uma classe existente. Faça um paralelo com C++, apresentando 5 exemplos**

<br>
A herança é um conceito de orientação a objetos que permite que uma classe herde os atributos e comportamentos de outra classe. A classe que herda é chamada de subclasse, e a classe que é herdada é chamada de superclasse.<br>
Para criar uma subclasse a partir de uma classe existente em Java:

```java
public class SubClasse extends SuperClasse {
  // atributos e comportamentos da subclasse
}

```
Por exemplo, a seguinte classe `Animal` é uma superclasse:
```java
public class Animal {
  public String nome;
  public int idade;
}

```
A classe `Cachorro` é uma subclasse de `Animal`:
```java
public class Cachorro extends Animal {
  public String raca;
  public boolean late;
}

```
A subclasse `Cachorro` herda os atributos `nome` e `idade` da superclasse `Animal`. Ela também adiciona os atributos `raca` e `late`.

O conceito de herança é semelhante em C++. Para criar uma subclasse a partir de uma classe existente em C++:
```cpp
class SubClasse : public SuperClasse {
  // atributos e comportamentos da subclasse
};

```
A classe Animal é uma superclasse:
```cpp
class Animal {
  public:
    string nome;
    int idade;
};

```
 A classe Cachorro é uma subclasse de Animal:
```cpp
class Cachorro : public Animal {
  public:
    string raca;
    bool late;
};

```
A subclasse `Cachorro` herda os atributos `nome` e `idade` da superclasse `Animal`. Ela também adiciona os atributos `raca` e `late`.

**Exemplos de herança em Java e C++:**

**Java**

**Exemplo 1**: Uma subclasse de `Pessoa` que representa um `Estudante`. A subclasse Estudante herda os atributos `nome`, `idade` e `endereco` da superclasse `Pessoa`, e adiciona o atributo `curso`.
```java
public class Estudante extends Pessoa {
  public String curso;
}

```
**Exemplo 2**: Uma subclasse de` Veiculo` que representa um `Carro`. A subclasse `Carro` herda os atributos `marca`, modelo e ano da superclasse `Veiculo`, e adiciona os atributos `cor` e `potencia`.
```java
public class Carro extends Veiculo {
  public String cor;
  public int potencia;
}

```
**Exemplo 3**: Uma subclasse de `FiguraGeometrica` que representa um `Retangulo`. A subclasse `Retangulo` herda os atributos `largura` e `altura `da superclasse `FiguraGeometrica`, e adiciona o atributo `cor`.

**C++**
**Exemplo 1**: Uma subclasse de `Person` que representa um `Student`. A subclasse `Student` herda os atributos `name`, `age` e `address` da superclasse `Person`, e adiciona o atributo `course`.
```C++
class Student : public Person {
  public:
    string course;
};

```
**Exemplo 2**: Uma subclasse de `Vehicle` que representa um `Car`. A subclasse `Car` herda os atributos `brand`,` model` e `year` da superclasse `Vehicle`, e adiciona os atributos `color` e `power`.
```cpp
class Car : public Vehicle {
  public:
    string color;
    int power;
};

```
**Exemplo 3**: Uma subclasse de GeometricFigure que representa um Rectangle. A subclasse Rectangle herda os atributos width e height da superclasse GeometricFigure, e adiciona o atributo color.
```cpp
class Rectangle : public GeometricFigure {
  public:
    string color;
};

```
> A herança é uma ferramenta poderosa que pode ser usada para reusar código e simplificar o design de sistemas de software. É um conceito importante da orientação a objetos que deve ser compreendido por qualquer desenvolvedor de software.


<hr>