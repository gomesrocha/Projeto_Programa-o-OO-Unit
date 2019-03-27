/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Dao;

import Model.Medico;
import Utils.BancoDeDados;
import com.google.gson.Gson;

/**
 *
 * @author fabio
 */
public class MedicoDao {
    Gson gson = new Gson();
    BancoDeDados bd = new BancoDeDados();
    public String salvar(Medico md){
        String medicoLista = gson.toJson(md);
        BancoDeDados.escreverArquivo(medicoLista, "medico.bd");
        return "Salvo com sucesso";
    }
    
    
}
