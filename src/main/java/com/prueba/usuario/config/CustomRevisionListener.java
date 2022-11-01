package com.prueba.usuario.config;

import com.prueba.usuario.entities.audit.Revision;
import org.hibernate.envers.RevisionListener;

public class CustomRevisionListener implements RevisionListener {

    public void newRevision(Object revisionEntity) {final Revision revision = (Revision) revisionEntity; }
}
