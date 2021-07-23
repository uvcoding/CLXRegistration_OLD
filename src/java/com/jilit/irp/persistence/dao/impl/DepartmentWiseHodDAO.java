/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jilit.irp.persistence.dao.impl;

import com.jilit.irp.persistence.dao.DepartmentWiseHodIDAO;
import com.jilit.irp.persistence.dao.HibernateDAO;
import com.jilit.irp.persistence.dto.DepartmentWiseHod;
import com.jilit.irp.util.JIRPDBUtil;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;

/**
 *
 * @author subrata.lohar
 */
public class DepartmentWiseHodDAO extends HibernateDAO implements DepartmentWiseHodIDAO {

    private static final Log log = LogFactory.getLog(DepartmentWiseHod.class);

    public Collection<?> findAll() {
        log.info("Retrieving all DepartmentWiseHod records via Hibernate from the database");
        return this.find("from DepartmentWiseHod as tname");
    }

    public Object findByPrimaryKey(Serializable id) {
        return getHibernateTemplate().get(DepartmentWiseHod.class, id);
    }
}