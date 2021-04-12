
package model;

public class EspeciesModel {
    private String fauna_flora;
    private String grupo;	
    private String familia;
    private String especie;
    private String nome_comum;
    private String categoria_de_ameaca;
    private String sigla_categoria_de_ameaca;	
    private String bioma;
    private String principais_ameacas;
    private String presenca_em_areas_protegidas;
    private String plano_de_acao_nacional;
    private String ordenamento_pesqueiro;
    private String nivel_de_protecao;
    private String especie_exclusiva_brasil;
    private String estados;
    
//    public EspeciesModel(String fauna_flora, String grupo){
//        this.fauna_flora = fauna_flora;
//        this.grupo = grupo;
//    }
    
    public void setFaunaFlora(String fauna_flora){
        this.fauna_flora = fauna_flora;
    }
    
    public String getFaunaFlora(){
        return this.fauna_flora;
    }
    
    public void setGrupo(String grupo){
        this.grupo = grupo;
    }
    
    public String getGrupo(){
        return this.grupo;
    }
    
    public void setFamilia(String familia){
        this.familia = familia;
    }
    
    public String getFamilia(){
        return this.familia;
    }
    
    public void setEspecie(String especie){
        this.especie = especie;
    }
    
    public String getEspecie(){
        return this.especie;
    }
    
    public void setNomeComum(String nome_comum){
        this.nome_comum = nome_comum;
    }
    
    public String getNomeComum(){
        return this.nome_comum;
    }
    
    public void setCategoriaDeAmeaca(String categoria_de_ameaca){
        this.categoria_de_ameaca = categoria_de_ameaca;
    }
    
    public String getCategoriaDeAmeaca(){
        return categoria_de_ameaca;
    }
    
    public void setSiglaCategoriaDeAmeaca(String sigla_categoria_de_ameaca){
        this.sigla_categoria_de_ameaca = sigla_categoria_de_ameaca;
    }
    
    public String getSiglaCategoriaDeAmeaca(){
        return sigla_categoria_de_ameaca;
    }
    
    public void setBioma(String bioma){
        this.bioma = bioma;
    }
    
    public String getBioma(){
        return bioma;
    }
    
    public void setPrincipaisAmeacas(String principais_ameacas){
        this.principais_ameacas = principais_ameacas;
    }
    
    public String getPrincipaisAmeacas(){
        return this.principais_ameacas;
    }
    
    public void setPresencaEmAreasProtegidas(String presenca_em_areas_protegidas){
        this.presenca_em_areas_protegidas = presenca_em_areas_protegidas;
    }
    
    public String getPresencaEmAreasProtegidas(){
        return this.presenca_em_areas_protegidas;
    }
    
    public void setPlanoDeAcaoNacional(String plano_de_acao_nacional){
        this.plano_de_acao_nacional = plano_de_acao_nacional;
    }
    
    public String getPlanoDeAcaoNacional(){
        return this.plano_de_acao_nacional;
    }
    
    public void setOrdenamentoPesqueiro(String ordenamento_pesqueiro){
        this.ordenamento_pesqueiro = ordenamento_pesqueiro;
    }
    
    public String getOrdenamentoPesqueiro(){
        return this.ordenamento_pesqueiro;
    }
    
    public void setNivelDeProtecao(String nivel_de_protecao){
        this.nivel_de_protecao = nivel_de_protecao;
    }
    
    public String getNivelDeProtecao(){
        return nivel_de_protecao;
    }
    
    public void setEspecieExclusivaBrasil(String especie_exclusiva_brasil){
        this.especie_exclusiva_brasil = especie_exclusiva_brasil;
    }
    
    public String getEspecieExclusivaBrasil(){
        return this.especie_exclusiva_brasil;
    }
    
    public void setEstados(String estados){
        this.estados = estados;
    }
    public String getEstados(){
        return estados;
    }
}
