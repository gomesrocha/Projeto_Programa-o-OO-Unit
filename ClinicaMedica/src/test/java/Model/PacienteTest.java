/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fabio Gomes Rocha
 */
public class PacienteTest {

    public PacienteTest() {
    }

    /**
     * Test of getDataCadastro method, of class Paciente.
     */
    @Test
    public void testGetDataCadastro() {
        System.out.println("getDataCadastro");
        Paciente instance = new Paciente();
        Date expResult = null;
        Date result = instance.getDataCadastro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataCadastro method, of class Paciente.
     */
    @Test
    public void testSetDataCadastro() {
        System.out.println("setDataCadastro");
        Date dataCadastro = null;
        Paciente instance = new Paciente();
        instance.setDataCadastro(dataCadastro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConvenio method, of class Paciente.
     */
    @Test
    public void testGetConvenio() {
        System.out.println("getConvenio");
        Paciente instance = new Paciente();
        String expResult = "";
        String result = instance.getConvenio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConvenio method, of class Paciente.
     */
    @Test
    public void testSetConvenio() {
        System.out.println("setConvenio");
        String convenio = "";
        Paciente instance = new Paciente();
        instance.setConvenio(convenio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSexo method, of class Paciente.
     */
    @Test
    public void testGetSexo() {
        System.out.println("getSexo");
        Paciente instance = new Paciente();
        String expResult = "";
        String result = instance.getSexo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSexo method, of class Paciente.
     */
    @Test
    public void testSetSexo() {
        System.out.println("setSexo");
        String sexo = "";
        Paciente instance = new Paciente();
        instance.setSexo(sexo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
