#language:pt
  Contexto:
   Dado que a modal esteja sendo exibida

  Funcionalidade: Login
    Cenario: Fechar modal ao clicar fora da mesma
      Quando for realizado um clique fora da modal
      Entao a janela modal deve ser fechada

    Cenario: Fechar modal ao clicar no icone fechar
      Quando for realizado um clique no icone de fechar da modal
      Entao a janela modal deve ser fechada

    Cenario: Link create new account
      Quando for realizado um clique no link create new account
      Entao a pagina create account deve ser exibida

      Esquema do Cenario: Realizar login com <identificacao>
        Quando os campos de login sejam preenchidos da seguinte forma
          | login    | <login>    |
          | password | <password> |
          | remember | <remember> |
        Quando for realizado o clique no botao sign in
        Entao deve ser possivel logar no sistema

        Exemplos:
        | identificacao       | login   | password | remember |
        | todos os campos     | chronos | senha    | true     |
        | campos obrigatórios | chronos | senha    | false    |

        Esquema do Cenario: Realizar login com <identificacao>
          Quando os campos de login forem preenchidos da seguinte forma
            |login   | <login>    |
            |password| <password> |
            |remember| <remember> |
          Quando for realizado o clique no botao sign in
          Entao o sistema devera exibir uma mensagem de erro

          Exemplos:
            | identificacao    | login    | password | remember |
            | usuario invalido | invalido | senha    | true     |
            | senha invalida   | chronos  | invalido | true     |

    Esquema do Cenario: Realizar login com <identificacao>
      Quando os campos de login sejam preenchidos da seguinte forma
        |login   | <login>    |
        |password| <password> |
        |remember| <remember> |
      Entao o botao sign in deve permanecer desabilitado

      Exemplos:
        | identificacao     | login   | password | remember |
        | usuario em branco |         | senha    | false    |
        | senha em branco   | chronos |          | false    |