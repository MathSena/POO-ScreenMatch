# ScreenMatch 
## Orientação a Objetos, Listas e Coleções em Java

Este repositório é dedicado ao estudo de Orientacão a objetos, Listas e Coleções em Java. Aqui, você encontrará exemplos de código, e explicações sobre como usar diferentes tipos de coleções em Java, incluindo `List`, `Set` e `Map`.
Além sobre os quatro conceitos principais da OOP: Encapsulamento, Herança, Polimorfismo e Abstração.


## Índice

- [Introdução](#introdução)
- [Encapsulamento](#encapsulamento)
- [Herança](#herança)
- [Polimorfismo](#polimorfismo)
- [Abstração](#abstração)
- [Lista](#lista)
- [Conjunto](#conjunto)
- [Mapa](#mapa)
- [Conclusão](#conclusão)

## Introdução

As coleções são usadas em programação quando queremos agrupar um conjunto de elementos. Em Java, o framework de Coleções oferece várias classes e interfaces para lidar com grupos de objetos.


## Encapsulamento

Encapsulamento é o conceito de esconder os detalhes de implementação e permitir que os dados sejam acessados por meio de métodos. Isso é muitas vezes referido como ocultação de dados.

```java
public class Exemplo {
    private String campoPrivado;

    public String getCampoPrivado() {
        return this.campoPrivado;
    }

    public void setCampoPrivado(String valor) {
        this.campoPrivado = valor;
    }
}
```

## Herança
Herança é um princípio que permite a uma classe herdar campos e métodos de outra classe.

```java

public class Pai {
public void metodoPai() {
// código
}
}

public class Filho extends Pai {
public void metodoFilho() {
// código
}
}
```

## Polimorfismo
Polimorfismo é o princípio pelo qual uma classe pode ter várias formas. Pode ser usado para se referir a um objeto de classe pai como um objeto de classe filho.

```java

Pai objeto = new Filho();
objeto.metodoPai();
Abstração
A abstração é o princípio de esconder os detalhes complexos e mostrar apenas a funcionalidade essencial.

java

public abstract class ExemploAbstrato {
public abstract void metodoAbstrato();
}
```

## Lista

Uma `List` em Java é uma interface que herda da interface `Collection` e declara métodos para manipular uma sequência de elementos.

```java
List<String> list = new ArrayList<String>();
list.add("Exemplo");
list.add("Lista");
```

## Conjunto
Um Set em Java é uma interface que herda da interface Collection e declara métodos e constantes que podem ser usados para operações de conjunto.

```java
Set<String> set = new HashSet<String>();
set.add("Exemplo");
set.add("Conjunto");
```
## Mapa
Um Map em Java é uma interface que define um tipo de mapeamento, que permite que objetos sejam armazenados e acessados por chave e valor.

``` java
Map<String, String> map = new HashMap<String, String>();
map.put("Chave", "Valor");
```

## Conclusão
Os conceitos de programação orientada a objetos são fundamentais para entender e usar várias linguagens de programação modernas. Este repositório ajuda a entender e usar esses conceitos importantes.

As coleções em Java são fundamentais para organizar e manipular grupos de objetos. Este repositório ajuda a entender e a usar esses conceitos importantes.

## Como contribuir
Sinta-se à vontade para criar um Fork deste repositório, propor mudanças via Pull Request ou abrir Issues.

## Licença
Este projeto está licenciado sob a MIT License - veja o arquivo LICENSE.md para mais detalhes.