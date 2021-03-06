package com.misys.tiplus2.customisation.entity.persister;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.misys.tiplus2.persistent.EntityPersister;
import com.misys.tiplus2.customisation.entity.CXPF;
import com.misys.tiplus2.customisation.entity.CXPF.Key_CXPF;

@SuppressWarnings("unchecked")
public class CXPFPersister extends EntityPersister {

	// This code will be generated by the builder 
	
	public CXPFPersister() {
		setKeyMembers(new MemberDescriptor[] {
            new MemberDescriptor("cxmnm", "CXPF.CXMNM", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("cxyoc", "CXPF.CXYOC", getBinderFactory().getBinderForType("Integer")),
		});
			
		setMembers(new MemberDescriptor[] {
            new MemberDescriptor("cxdiy", "CXPF.CXDIY", getBinderFactory().getBinderForType("Varchar")),
            new MemberDescriptor("cxdfn", "CXPF.CXDFN", getBinderFactory().getBinderForType("Date")),
            new MemberDescriptor("cxdlm", "CXPF.CXDLM", getBinderFactory().getBinderForType("Date")),
            new MemberDescriptor("cxdoo", "CXPF.CXDOO", getBinderFactory().getBinderForType("Integer")),
            new MemberDescriptor("cxdesc", "CXPF.CXDESC", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("mnt_in_bo", "CXPF.MNT_IN_BO", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("cxdiw", "CXPF.CXDIW", getBinderFactory().getBinderForType("String")),
		});

		setForeignKeyMappings(new ForeignKeyMappingDescriptor[] {
		});
	}

    private static final String tableName = "CXPF";

    /**
     * Gets the table name - in this case CXPF
     * <p>
     * Note that the <i>schema</i> must be prefixed to this when constructing
     * SQL statements, for example: <code>schema.CXPF</code>
     * 
     * @return the table name
     */
	@Override
	public String getTableName() {       
		return tableName;
	}

	@Override
	public Class<?> getEntityClass() {
		return CXPF.class;
	}

	public Class<?> getKeyClass() {
		return Key_CXPF.class;
	}

	@Override
	public CXPF constructEntity(final Object[] keyValues, final Object[] resultRow) {
		final CXPF entity = new CXPF();
		
		// Key members
		final Key_CXPF key = entity.get$key();
		assignKeyValues(key, keyValues);

		assignMemberValues(entity, resultRow);
		
		return entity;
	}
	
	@Override
	public Key_CXPF constructKey(final Object[] keyValues) {
		final Key_CXPF key = new Key_CXPF();
		assignKeyValues(key, keyValues);
		return key;
	}
	
	@Override
	public void assignKeyValues(final Object object, final Object[] resultRow) {
		final Key_CXPF result = (Key_CXPF)object;
		int index = 0;
		result.setCxmnm((java.lang.String)resultRow[index++]);
		result.setCxyoc((java.lang.Integer)resultRow[index++]);
	}
	
	@Override
	public void assignMemberValues(final Object object, final Object[] resultRow) {
		final CXPF result = (CXPF)object;
		int index = 0;
		result.setCxdiy((java.lang.String)resultRow[index++]);
		result.setCxdfn((java.util.Date)resultRow[index++]);
		result.setCxdlm((java.util.Date)resultRow[index++]);
		result.setCxdoo((java.lang.Integer)resultRow[index++]);
		result.setCxdesc((java.lang.String)resultRow[index++]);
		result.setMnt_in_bo((java.lang.String)resultRow[index++]);
		result.setCxdiw((java.lang.String)resultRow[index++]);
	}

	@Override
	public Object[] getKeyMemberValues(final Object object) {
		final Key_CXPF entity = (Key_CXPF)object;
		final Object[] result = new Object[2];
		int index = 0;
		result[index++] = entity.getCxmnm();
		result[index++] = entity.getCxyoc();
		return result;
	}

	@Override
	public Object[] getMemberValues(final Object object) {
		final CXPF entity = (CXPF)object;
		final Object[] result = new Object[7];
		int index = 0;
		result[index++] = entity.getCxdiy();
		result[index++] = entity.getCxdfn();
		result[index++] = entity.getCxdlm();
		result[index++] = entity.getCxdoo();
		result[index++] = entity.getCxdesc();
		result[index++] = entity.getMnt_in_bo();
		result[index++] = entity.getCxdiw();
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
		return (((CXPF)entity).get$key());
	}

}
