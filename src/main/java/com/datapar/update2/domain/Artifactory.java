package com.datapar.update2.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by george.bonespirito on 17/02/2017.
 */
@Entity
public class Artifactory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;
    private String host;
    private String respository;
    private String versao;

    public Artifactory() {
    }

    public Artifactory(String host, String respository, String versao) {
        this.host = host;
        this.respository = respository;
        this.versao = versao;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setRespository(String respository) {
        this.respository = respository;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public Long getCodigo() {
        return codigo;
    }

    public String getHost() {
        return host;
    }

    public String getRespository() {
        return respository;
    }

    public String getVersao() {
        return versao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Artifactory that = (Artifactory) o;

        return codigo.equals(that.codigo);
    }

    @Override
    public int hashCode() {
        return codigo.hashCode();
    }
}
