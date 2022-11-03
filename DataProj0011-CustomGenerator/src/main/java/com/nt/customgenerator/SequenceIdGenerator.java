package com.nt.customgenerator;

import java.io.Serializable;

import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class SequenceIdGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor ses, Object object) throws HibernateException {
		System.out.println("generator class");
		Query query=ses.createQuery("select count(*) from Actor");
		Long count=(Long)query.getSingleResult();
		return "NIT-00"+count;
	}

}
