/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jilit.irp.persistence.dao.impl;

import com.jilit.irp.persistence.dao.HibernateDAO;
import com.jilit.irp.persistence.dao.HostelTypeIDAO;
import com.jilit.irp.persistence.dto.HostelType;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Expression;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;

/**
 *
 * @author v.kumar
 */
public class HostelTypeDAO extends HibernateDAO implements HostelTypeIDAO {

    private static final Log log = LogFactory.getLog(HostelTypeDAO.class);

    public Collection<?> findAll() {
        log.info("Retrieving all HostelType records via Hibernate from the database");
        return this.find("from HostelType as tname where coalesce(deactive,'N')='N' order by seqid asc");
    }

    public Object findByPrimaryKey(Serializable id) {
        return getHibernateTemplate().get(HostelType.class, id);
    }
}