#language: pt
Funcionalidade: CRUD Processos
  Contexto:
    Dado  que o usuário está na Pagina Inicial
    E o usuário clicar no menu "processos"
    E o usuário clicar no botão novo processo
    E o usuário digitar no campo "processo_vara" o valor "São Paulo"
    E o usuário digitar no campo "processo_numero_processo" o valor "234"
    E o usuário digitar no campo "processo_natureza" o valor "Civil"
    E o usuário digitar no campo "processo_partes" o valor "Queitilin x Vitao"
    E o usuário seleciona no campo urgencia o valor "Não"
    E o usuário clica no campo arbitramento com o valor Sim
    E o usuário digitar no campo "processo_assistente_social" o valor "Cinthia"
    E o usuário digitar no campo "processo_data_entrada" o valor "05/01/2021"
    E o usuário digitar no campo "processo_data_saida" o valor "05/04/2021"
    E o usuário digitar no campo "processo_data_agendamento" o valor "05/03/2021"
    E o usuário digitar no campo "processo_status" o valor "Agendado"
    E o usuário digitar no campo "processo_observacao" o valor "Teste"

  Cenario: Adicionar um novo processo (Create)
    Quando o usuário clicar no botão salvar na página de inclusão de processos
    Então o usuário deveria visualizar a mensagem "Processo foi criado com sucesso."


  Cenario: Exibir Novo Processo (Read)
    E o usuário clicar no botão salvar na página de inclusão de processos
    E o usuário clicar em voltar
    Quando o usuário clica no botao mostrar do processo cadastrado
    Então o usuário deveria ver o valor "São Paulo" no campo "vara"
    E o usuário deveria ver o valor "234" no campo "numero"
    E o usuário deveria ver o valor "Civil" no campo "natureza"
    E o usuário deveria ver o valor "Queitilin x Vitao" no campo "partes"
    E o usuário deveria ver o valor "N" no campo "urgente"
    E o usuário deveria ver o valor "S" no campo "arbitramento"
    E o usuário deveria ver o valor "Cinthia" no campo "as_social"
    E o usuário deveria ver o valor "2021-01-05" no campo "dt_entrada"
    E o usuário deveria ver o valor "2021-04-05" no campo "dt_saida"
    E o usuário deveria ver o valor "2021-03-05" no campo "dt_agendamento"
    E o usuário deveria ver o valor "Agendado" no campo "status"
    E o usuário deveria ver o valor "Teste" no campo "observacao"

  Cenario:  Editar Processo(Update)
    E o usuário clicar no botão salvar na página de inclusão de processos
    E o usuário clicar em voltar
    E o usuário clica no botao editar do processo cadastrado
    E o usuário digitar no campo de editar "processo_vara" o valor "Rio de Janeiro"
    Quando o usuário clicar no botão salvar na página de editar
    Então o usuário deveria ver o valor "Rio de Janeiro" no campo "vara"

  Cenario: Deletar Processo (Delete)
    E o usuário clicar no botão salvar na página de inclusão de processos
    E o usuário clicar em voltar
    Quando o usuário clicar no botao apagar do processo cadastrado
    E o usuario confirmar a deleção
    Então o botão apagar não pode mais exister para o processo cadastrado

  @example
  Esquema do Cenario: : Validação de POST via Scenario Outline. Teste: <mensagem retorno>
    Dado  que o usuário está na Pagina Inicial
    E o usuário clicar no menu "processos"
    E o usuário clicar no botão novo processo
    E o usuário digitar no campo "processo_vara" o valor "São Paulo"
    E o usuário digitar no campo "processo_numero_processo" o valor "234"
    E o usuário digitar no campo "processo_natureza" o valor "<natureza>"
    E o usuário digitar no campo "processo_partes" o valor "Queitilin x Vitao"
    E o usuário seleciona no campo urgencia o valor "Não"
    E o usuário clica no campo arbitramento com o valor Sim
    E o usuário digitar no campo "processo_assistente_social" o valor "Cinthia"
    E o usuário digitar no campo "processo_data_entrada" o valor "05/01/2021"
    E o usuário digitar no campo "processo_data_saida" o valor "05/04/2021"
    E o usuário digitar no campo "processo_data_agendamento" o valor "05/03/2021"
    E o usuário digitar no campo "processo_status" o valor "Agendado"
    E o usuário digitar no campo "processo_observacao" o valor "Teste"

    Exemplos:
      | natureza | mensagem retorno        |
      | Civil    | Salvo com sucesso       |
      | Crimical | Nao processado          |


