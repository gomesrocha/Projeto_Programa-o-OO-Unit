/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author fabio
 */
public interface IFolhaPagamento {

    public float calcularINSS();

    public float calcularIRRF();

    public float calcularDescontos();

    public float calcularSalarioLiquido();

    public float salvarFolha();
}
