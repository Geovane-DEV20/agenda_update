package br.com.projetogeovane.agenda;

import android.widget.EditText;
import android.widget.RatingBar;

import br.com.projetogeovane.agenda.modelo.Nome;

public class FormularioHelper {

    private final EditText campoNome;
    private final EditText campoEndereco;
    private final EditText campoTelefone;
    private final EditText campoemail;
    private final RatingBar camponota;

    public FormularioHelper(FormularioActivity activity) {
        campoNome = (EditText) activity.findViewById(R.id.formulario_nome);
        campoEndereco = (EditText) activity.findViewById(R.id.formulario_endereco);
        campoTelefone = (EditText) activity.findViewById(R.id.formulario_telefone);
        campoemail = (EditText) activity.findViewById(R.id.formulario_email);
        camponota = (RatingBar) activity.findViewById(R.id.formulario_nota);

    }

    public Nome pegaNome() {
        Nome nome = new Nome();
        nome.setNome(campoNome.getText().toString());
        nome.setEndereco(campoEndereco.getText().toString());
        nome.setTelefone(campoTelefone.getText().toString());
        nome.setemail(campoemail.getText().toString());
        nome.setNota(Double.valueOf(camponota.getProgress()));
        

        return nome;
    }
}
