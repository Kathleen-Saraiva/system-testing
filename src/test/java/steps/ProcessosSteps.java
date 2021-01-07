package steps;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import pages.*;
import support.BaseSteps;

public class ProcessosSteps extends BaseSteps {
    private Home home = new Home(driver);
    private Menu menu = new Menu(driver);
    private OptionsProcessos optionsProcessos = new OptionsProcessos(driver);
    private ProcessosPost processosPost = new ProcessosPost(driver);
    private ProcessoEdit processoEdit = new ProcessoEdit(driver);
    private ProcessosMostrar processosMostrar = new ProcessosMostrar(driver);

    @Dado("^que o usuário está na Pagina Inicial$")
    public void queOUsuarioEstaNaPaginaInicial() {
        home.abrirPagina();
    }
    @E("^o usuário clicar no menu \"([^\"]*)\"$")
    public void oUsuarioClicarNoMenu(String vMenu) throws Throwable {
        menu.clicarMenu(vMenu);
    }
    @E("^o usuário clicar no botão novo processo$")
    public void oUsuarioClicarNoBotaoNovoProcesso() {
        optionsProcessos.clickNovoProcesso();
    }
    @E("^o usuário digitar no campo \"([^\"]*)\" o valor \"([^\"]*)\"$")
    public void oUsuarioDigitarNoCampoOValor(String campo, String valor) throws Throwable {
        processosPost.preencherCampo(campo, valor);
    }
    @E("^o usuário digitar no campo de editar \"([^\"]*)\" o valor \"([^\"]*)\"$")
    public void oUsuarioDigitarNoCampoDeEditarOValor(String campo, String valor) throws Throwable {
        processoEdit.preencherCampo(campo, valor);
    }
    @Quando("^o usuário clicar no botão salvar na página de inclusão de processos$")
    public void oUsuarioClicarNoBotaoSalvar() {
        processosPost.clicarSalvar();
        processosPost.setCode(processosMostrar.recuperaCodigo());
    }
    @Quando("^o usuário clicar no botão salvar na página de editar$")
    public void oUsuarioClicarNoBotaoSalvarEmEditar() {
        processoEdit.clicarSalvar();
    }
    @Então("^o usuário deveria visualizar a mensagem \"([^\"]*)\"$")
    public void oUsuarioDeveriaVisualizarAMensagem(String message) throws Throwable {
        Assert.assertEquals(message, processosMostrar.recuperarMensagemDeSucesso());
    }
    @E("^o usuário seleciona no campo urgencia o valor \"([^\"]*)\"$")
    public void oUsuárioSelecionaNoCampoOValor(String valor) throws Throwable {
        processosPost.selecionarUrgencia(valor);
    }
    @E("^o usuário clica no campo arbitramento com o valor Sim$")
    public void oUsuárioClicaNoCampoArbitramentoComOValorSim() {
        processosPost.clicarArbitramentoSim();
    }
    @Quando("^o usuário clicar em voltar$")
    public void oUsuárioClicarEmVoltar() {
        processosMostrar.clicarVoltar();
    }
    @Quando ("^o usuário clica no botao mostrar do processo cadastrado$")
    public void oUsuarioClicaNoBotaoMostrarDoUsuarioCadastrado(){
        optionsProcessos.clickMostrar(processosPost.getCode());
    }
    @Quando ("^o usuário clica no botao editar do processo cadastrado$")
    public void oUsuarioClicaNoBotaoEditarDoUsuarioCadastrado(){
        optionsProcessos.clickEditar(processosPost.getCode());
    }

    @Então("^o usuário deveria ver o valor \"([^\"]*)\" no campo \"([^\"]*)\"$")
    public void oUsuarioDeveriaVerOValorNoCampo(String value, String field) throws Throwable{
        Assert.assertEquals(value,processosMostrar.getField(field));
    }

    @Quando("^o usuário clicar no botao apagar do processo cadastrado$")
    public void oUsuarioClicarNoBotaoApagarDoProcessoCadastrado() {
        optionsProcessos.clickDeletar(processosPost.getCode());
    }

    @E("^o usuario confirmar a deleção$")
    public void oUsuarioConfirmarADelecao() {
        optionsProcessos.confirmaDelecao();
    }

    @Então("^o botão apagar não pode mais exister para o processo cadastrado$")
    public void oBotaoApagarNaoPodeMaisExisterParaOProcessoCadastrado() {
        Assert.assertFalse(optionsProcessos.existeBotaoApagar(processosPost.getCode()));
    }
}
