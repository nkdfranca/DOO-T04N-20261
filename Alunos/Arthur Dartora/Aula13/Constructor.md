# Atividade Extra - Aula 13

Música analisada: **Nanowar of Steel - HelloWorld.java**
Link: https://www.youtube.com/watch?v=BsfXZjKLT9A

Nessa música a letra é um código Java cantado. Peguei dois conceitos que
aparecem nesse código pra explicar.

---

## Conceito 1

**Nome:** Arthur Dartora

**Conceito escolhido:** Construtor

**Timestamp do vídeo que menciona o conceito:** por volta de 0:35
(quando canta `public HelloWorld... super... this.foo = foo`)
> Dá uma conferida no segundo certo no vídeo antes de entregar.

### O que é?

O construtor é um pedaço de código que roda sozinho na hora que você cria um
objeto com o `new`. Ele tem o mesmo nome da classe e não tem retorno (não
tem `void`, `int`, nada disso na frente).

### Pra que serve?

Serve pra já deixar o objeto pronto na hora que ele é criado. Em vez de criar
o objeto vazio e preencher tudo depois, você passa as informações ali no `new`
e o construtor guarda elas pra você.

### Como é normalmente utilizado?

Você escreve um método com o mesmo nome da classe e pode pedir umas
informações nos parênteses. Quando faz `new NomeDaClasse("algo")`, esses dados
vão direto pro construtor.

### Exemplo de código

```java
public class Cachorro {

    String nome;

    // Isto é o construtor (mesmo nome da classe)
    public Cachorro(String nomeDoCachorro) {
        nome = nomeDoCachorro; // guarda o nome quando o objeto é criado
    }

    public static void main(String[] args) {
        // Aqui o construtor roda e já guarda o nome
        Cachorro meuCachorro = new Cachorro("Picolino");

        System.out.println("O nome do cachorro é: " + meuCachorro.nome);
    }
}
```

Resultado:

```
O nome do cachorro é: Picolino
```

---

## Conceito 2

**Conceito escolhido:** Modificadores de acesso (`public` e `private`)

**Timestamp do vídeo que menciona o conceito:** por volta de 0:20
(no `public class`) e de novo no `private Integer foo`, por volta de 0:50.
> Confere os segundos certos no vídeo antes de entregar.

### O que é?

São palavrinhas que ficam na frente da classe, da variável ou do método. Elas
dizem quem pode usar aquilo. As duas mais comuns são:

- `public`: qualquer parte do programa pode acessar.
- `private`: só a própria classe pode acessar.

### Pra que serve?

Serve pra proteger as informações do objeto. Tem coisa que a gente não quer
que seja mexida de fora sem controle. Deixando como `private`, ninguém de fora
mexe direto.

### Como é normalmente utilizado?

O normal é deixar as variáveis como `private` e criar métodos `public` pra
mexer nelas. Esses métodos públicos são tipo uma portinha oficial pra acessar
o que está protegido.

### Exemplo de código

```java
public class ContaBanco {

    private double saldo = 0; // private: só esta classe mexe

    // public: qualquer um pode chamar
    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public double verSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        ContaBanco minhaConta = new ContaBanco();

        minhaConta.depositar(100);
        minhaConta.depositar(50);

        System.out.println("Saldo: " + minhaConta.verSaldo());

        // minhaConta.saldo = 9999;  -> isso daria ERRO,
        // porque saldo é private e não pode ser usado de fora.
    }
}
```

Resultado:

```
Saldo: 150.0
```
