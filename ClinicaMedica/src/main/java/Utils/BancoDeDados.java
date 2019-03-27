/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fabio
 */
public class BancoDeDados {

    public static void escreverArquivo(String json, String caminho) {
        Path arquivo = Paths.get(caminho);
        if (!Files.exists(arquivo)) {
            BufferedWriter bw = null;

            try {
                Files.createFile(arquivo);
                bw = new BufferedWriter(new FileWriter(arquivo.toFile(), true));
                bw.write(json);
            } catch (IOException ex) {
                Logger.getLogger(BancoDeDados.class.getName()).log(Level.SEVERE, null, ex);
            } finally {

                try {
                    bw.close();
                } catch (IOException ex) {
                    Logger.getLogger(BancoDeDados.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            BufferedWriter bw = null;
            try {
                bw = new BufferedWriter(new FileWriter(arquivo.toFile(), true));
                bw.newLine();
                bw.write(json);
            } catch (IOException ex) {
                Logger.getLogger(BancoDeDados.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    bw.close();
                } catch (IOException ex) {
                Logger.getLogger(BancoDeDados.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static List<String> lerArquivo(String caminho) {
        List<String> linhas = new ArrayList<>();
        Path arquivo = Paths.get(caminho);
        if (Files.exists(arquivo)) {
            try {
                linhas = Files.readAllLines(arquivo, Charset.defaultCharset());
            } catch (IOException ex) {
                Logger.getLogger(BancoDeDados.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return linhas;
    }

}
