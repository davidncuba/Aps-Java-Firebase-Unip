/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class EspeciesTableModel extends AbstractTableModel {

    private ArrayList<EspeciesModel> linhas;
    String[] colunas;

    public EspeciesTableModel(ArrayList<EspeciesModel> arrayusuario, String[] colunas) {
        this.colunas = colunas;
        linhas = arrayusuario;
    }

    //Retorna a quantidade de colunas do modelo, que no caso será fixa
    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    //Retorna a quantidade de linhas atual do objeto, que no caso é o tamnho da lista
    @Override
    public int getRowCount() {
        return linhas.size();
    }

    //Retorna o nome da coluna, recebendo seu índice
    @Override
    public String getColumnName(int indiceColuna) {
        return colunas[indiceColuna];
    }

    @Override
    public Object getValueAt(int row, int col) {
        EspeciesModel especie = (EspeciesModel) linhas.get(row);
        switch (col) {
            case 0:
                return especie.getEspecie();
            case 1:
                return especie.getNomeComum();
            case 2:
                return especie.getFaunaFlora();
            case 3:
                return especie.getGrupo();
            case 4:
                return especie.getFamilia();
            case 5:
                return especie.getCategoriaDeAmeaca();
            case 6:
                return especie.getSiglaCategoriaDeAmeaca();
            default:
                return null;
        }
    }

//    "Espécie", "Nome Comum", "Fauna/Flora", "Grupo", "Família", "Categoria de Ameaça"

    //Adicionamos várias linhas na tabela de uma vez, recebendo um List de UsuarioModel
    public void addLista(ArrayList<EspeciesModel> usuario) {
        int tamanhoAntigo = getRowCount();

        //Adiciona os usuários
        linhas.addAll(usuario);

        //Aqui reportamos a mudança para o JTable, assim ele pode se redesenhar, para visualizarmos a alteração
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }
}
