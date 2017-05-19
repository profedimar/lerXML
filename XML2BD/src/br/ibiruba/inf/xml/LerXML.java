/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ibiruba.inf.xml;

import br.ibiruba.inf.beans.Cidade;
import java.util.List;

/**
 *
 * @author labin
 */
public abstract class LerXML {
    
    public abstract List<Cidade> lerCidades(String pathXML);
}
