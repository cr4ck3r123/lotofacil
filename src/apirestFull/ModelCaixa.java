/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apirestFull;

import java.util.List;

public class ModelCaixa {

    public String tipoJogo;
    public int numero;
    public String nomeMunicipioUFSorteio;
    public String dataApuracao;
    public double valorArrecadado;
    public double valorEstimadoProximoConcurso;
    public double valorAcumuladoProximoConcurso;
    public double valorAcumuladoConcursoEspecial;
    public double valorAcumuladoConcurso_0_5;
    public boolean acumulado;
    public int indicadorConcursoEspecial;
    public List<Object> dezenasSorteadasOrdemSorteio;
    public Object listaResultadoEquipeEsportiva;
    public int numeroJogo;
    public String nomeTimeCoracaoMesSorte;
    public int tipoPublicacao;
    public String observacao;
    public String localSorteio;
    public String dataProximoConcurso;
    public int numeroConcursoAnterior;
    public int numeroConcursoProximo;
    public int valorTotalPremioFaixaUm;
    public int numeroConcursoFinal_0_5;
   // public List<ListaMunicipioUFGanhadore> listaMunicipioUFGanhadores;
    //public List<ListaRateioPremio> listaRateioPremio;
    public List<String> listaDezenas;
    public Object listaDezenasSegundoSorteio;
    public Object id;

    public ModelCaixa() {
    }

    public String getTipoJogo() {
        return tipoJogo;
    }

    public void setTipoJogo(String tipoJogo) {
        this.tipoJogo = tipoJogo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeMunicipioUFSorteio() {
        return nomeMunicipioUFSorteio;
    }

    public void setNomeMunicipioUFSorteio(String nomeMunicipioUFSorteio) {
        this.nomeMunicipioUFSorteio = nomeMunicipioUFSorteio;
    }

    public String getDataApuracao() {
        return dataApuracao;
    }

    public void setDataApuracao(String dataApuracao) {
        this.dataApuracao = dataApuracao;
    }

    public double getValorArrecadado() {
        return valorArrecadado;
    }

    public void setValorArrecadado(double valorArrecadado) {
        this.valorArrecadado = valorArrecadado;
    }

    public double getValorEstimadoProximoConcurso() {
        return valorEstimadoProximoConcurso;
    }

    public void setValorEstimadoProximoConcurso(int valorEstimadoProximoConcurso) {
        this.valorEstimadoProximoConcurso = valorEstimadoProximoConcurso;
    }

    public double getValorAcumuladoProximoConcurso() {
        return valorAcumuladoProximoConcurso;
    }

    public void setValorAcumuladoProximoConcurso(int valorAcumuladoProximoConcurso) {
        this.valorAcumuladoProximoConcurso = valorAcumuladoProximoConcurso;
    }

    public double getValorAcumuladoConcursoEspecial() {
        return valorAcumuladoConcursoEspecial;
    }

    public void setValorAcumuladoConcursoEspecial(double valorAcumuladoConcursoEspecial) {
        this.valorAcumuladoConcursoEspecial = valorAcumuladoConcursoEspecial;
    }

    public double getValorAcumuladoConcurso_0_5() {
        return valorAcumuladoConcurso_0_5;
    }

    public void setValorAcumuladoConcurso_0_5(double valorAcumuladoConcurso_0_5) {
        this.valorAcumuladoConcurso_0_5 = valorAcumuladoConcurso_0_5;
    }

    public boolean isAcumulado() {
        return acumulado;
    }

    public void setAcumulado(boolean acumulado) {
        this.acumulado = acumulado;
    }

    public int getIndicadorConcursoEspecial() {
        return indicadorConcursoEspecial;
    }

    public void setIndicadorConcursoEspecial(int indicadorConcursoEspecial) {
        this.indicadorConcursoEspecial = indicadorConcursoEspecial;
    }

    public List<Object> getDezenasSorteadasOrdemSorteio() {
        return dezenasSorteadasOrdemSorteio;
    }

    public void setDezenasSorteadasOrdemSorteio(List<Object> dezenasSorteadasOrdemSorteio) {
        this.dezenasSorteadasOrdemSorteio = dezenasSorteadasOrdemSorteio;
    }

    public Object getListaResultadoEquipeEsportiva() {
        return listaResultadoEquipeEsportiva;
    }

    public void setListaResultadoEquipeEsportiva(Object listaResultadoEquipeEsportiva) {
        this.listaResultadoEquipeEsportiva = listaResultadoEquipeEsportiva;
    }

    public int getNumeroJogo() {
        return numeroJogo;
    }

    public void setNumeroJogo(int numeroJogo) {
        this.numeroJogo = numeroJogo;
    }

    public String getNomeTimeCoracaoMesSorte() {
        return nomeTimeCoracaoMesSorte;
    }

    public void setNomeTimeCoracaoMesSorte(String nomeTimeCoracaoMesSorte) {
        this.nomeTimeCoracaoMesSorte = nomeTimeCoracaoMesSorte;
    }

    public int getTipoPublicacao() {
        return tipoPublicacao;
    }

    public void setTipoPublicacao(int tipoPublicacao) {
        this.tipoPublicacao = tipoPublicacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getLocalSorteio() {
        return localSorteio;
    }

    public void setLocalSorteio(String localSorteio) {
        this.localSorteio = localSorteio;
    }

    public String getDataProximoConcurso() {
        return dataProximoConcurso;
    }

    public void setDataProximoConcurso(String dataProximoConcurso) {
        this.dataProximoConcurso = dataProximoConcurso;
    }

    public int getNumeroConcursoAnterior() {
        return numeroConcursoAnterior;
    }

    public void setNumeroConcursoAnterior(int numeroConcursoAnterior) {
        this.numeroConcursoAnterior = numeroConcursoAnterior;
    }

    public int getNumeroConcursoProximo() {
        return numeroConcursoProximo;
    }

    public void setNumeroConcursoProximo(int numeroConcursoProximo) {
        this.numeroConcursoProximo = numeroConcursoProximo;
    }

    public int getValorTotalPremioFaixaUm() {
        return valorTotalPremioFaixaUm;
    }

    public void setValorTotalPremioFaixaUm(int valorTotalPremioFaixaUm) {
        this.valorTotalPremioFaixaUm = valorTotalPremioFaixaUm;
    }

    public int getNumeroConcursoFinal_0_5() {
        return numeroConcursoFinal_0_5;
    }

    public void setNumeroConcursoFinal_0_5(int numeroConcursoFinal_0_5) {
        this.numeroConcursoFinal_0_5 = numeroConcursoFinal_0_5;
    }

    public List<String> getListaDezenas() {
        return listaDezenas;
    }

    public void setListaDezenas(List<String> listaDezenas) {
        this.listaDezenas = listaDezenas;
    }

    public Object getListaDezenasSegundoSorteio() {
        return listaDezenasSegundoSorteio;
    }

    public void setListaDezenasSegundoSorteio(Object listaDezenasSegundoSorteio) {
        this.listaDezenasSegundoSorteio = listaDezenasSegundoSorteio;
    }

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    
    
}
