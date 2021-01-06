#language: pt
Funcionalidade: Adicionar Novo Processo
  Cenario: Adicionar um novo processo (Create)
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

    Quando o usuário clicar no botão "btn-save" na página de inclusão de processos
    Então o usuário deveria visualizar a mensagem "Processo foi criado com sucesso."

    Quando o usuário clicar em voltar
    Então o usuário deveria ver o texto "Queitilin x Vitao"
