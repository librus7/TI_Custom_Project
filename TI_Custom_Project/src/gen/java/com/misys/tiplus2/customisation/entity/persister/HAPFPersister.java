package com.misys.tiplus2.customisation.entity.persister;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.misys.tiplus2.persistent.EntityPersister;
import com.misys.tiplus2.customisation.entity.HAPF;
import com.misys.tiplus2.customisation.entity.HAPF.Key_HAPF;

@SuppressWarnings("unchecked")
public class HAPFPersister extends EntityPersister {

	// This code will be generated by the builder 
	
	public HAPFPersister() {
		setKeyMembers(new MemberDescriptor[] {
            new MemberDescriptor("hacfk", "HAPF.HACFK", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("halnm", "HAPF.HALNM", getBinderFactory().getBinderForType("String")),
		});
			
		setMembers(new MemberDescriptor[] {
            new MemberDescriptor("mnt_in_bo", "HAPF.MNT_IN_BO", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("hasdx", "HAPF.HASDX", getBinderFactory().getBinderForType("String")),
		});

		setForeignKeyMappings(new ForeignKeyMappingDescriptor[] {
		});
	}

    private static final String tableName = "HAPF";

    /**
     * Gets the table name - in this case HAPF
     * <p>
     * Note that the <i>schema</i> must be prefixed to this when constructing
     * SQL statements, for example: <code>schema.HAPF</code>
     * 
     * @return the table name
     */
	@Override
	public String getTableName() {       
		return tableName;
	}

	@Override
	public Class<?> getEntityClass() {
		return HAPF.class;
	}

	public Class<?> getKeyClass() {
		return Key_HAPF.class;
	}

	@Override
	public HAPF constructEntity(final Object[] keyValues, final Object[] resultRow) {
		final HAPF entity = new HAPF();
		
		// Key members
		final Key_HAPF key = entity.get$key();
		assignKeyValues(key, keyValues);

		assignMemberValues(entity, resultRow);
		
		return entity;
	}
	
	@Override
	public Key_HAPF constructKey(final Object[] keyValues) {
		final Key_HAPF key = new Key_HAPF();
		assignKeyValues(key, keyValues);
		return key;
	}
	
	@Override
	public void assignKeyValues(final Object object, final Object[] resultRow) {
		final Key_HAPF result = (Key_HAPF)object;
		int index = 0;
		result.setHacfk((java.lang.String)resultRow[index++]);
		result.setHalnm((java.lang.String)resultRow[index++]);
	}
	
	@Override
	public void assignMemberValues(final Object object, final Object[] resultRow) {
		final HAPF result = (HAPF)object;
		int index = 0;
		result.setMnt_in_bo((java.lang.String)resultRow[index++]);
		result.setHasdx((java.lang.String)resultRow[index++]);
	}

	@Override
	public Object[] getKeyMemberValues(final Object object) {
		final Key_HAPF entity = (Key_HAPF)object;
		final Object[] result = new Object[2];
		int index = 0;
		result[index++] = entity.getHacfk();
		result[index++] = entity.getHalnm();
		return result;
	}

	@Override
	public Object[] getMemberValues(final Object object) {
		final HAPF entity = (HAPF)object;
		final Object[] result = new Object[2];
		int index = 0;
		result[index++] = entity.getMnt_in_bo();
		result[index++] = entity.getHasdx();
		return result;
	}

	@Override
	public Object[] getMemberValuesForMember(final String memberName, final Object object) {
		throw new IllegalArgumentException("Not a complex member: " + memberName);
	}

	@Override
	public boolean requiresOptimisticLocking() {
		return false;
	}

	@Override
	public Object[] extractKeyValues(ResultSet resultSet) throws SQLException {
		return super.extractKeyValues(resultSet);
	}

	@Override
	public int bindKeyValues(Object[] keyValues, PreparedStatement stmt, final int startIndex) throws SQLException {
		return super.bindKeyValues(keyValues, stmt, startIndex);
	}

    @Override
	public Object getKeyFromEntity(final Object entity) {
		return (((HAPF)entity).get$key());
	}

}
