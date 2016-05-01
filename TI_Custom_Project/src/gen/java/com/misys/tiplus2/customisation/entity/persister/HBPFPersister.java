package com.misys.tiplus2.customisation.entity.persister;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.misys.tiplus2.persistent.EntityPersister;
import com.misys.tiplus2.customisation.entity.HBPF;
import com.misys.tiplus2.customisation.entity.HBPF.Key_HBPF;

@SuppressWarnings("unchecked")
public class HBPFPersister extends EntityPersister {

	// This code will be generated by the builder 
	
	public HBPFPersister() {
		setKeyMembers(new MemberDescriptor[] {
            new MemberDescriptor("hbcfl", "HBPF.HBCFL", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("hblnm", "HBPF.HBLNM", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("hbcfn", "HBPF.HBCFN", getBinderFactory().getBinderForType("String")),
		});
			
		setMembers(new MemberDescriptor[] {
            new MemberDescriptor("hbrnm", "HBPF.HBRNM", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("mnt_in_bo", "HBPF.MNT_IN_BO", getBinderFactory().getBinderForType("String")),
		});

		setForeignKeyMappings(new ForeignKeyMappingDescriptor[] {
		});
	}

    private static final String tableName = "HBPF";

    /**
     * Gets the table name - in this case HBPF
     * <p>
     * Note that the <i>schema</i> must be prefixed to this when constructing
     * SQL statements, for example: <code>schema.HBPF</code>
     * 
     * @return the table name
     */
	@Override
	public String getTableName() {       
		return tableName;
	}

	@Override
	public Class<?> getEntityClass() {
		return HBPF.class;
	}

	public Class<?> getKeyClass() {
		return Key_HBPF.class;
	}

	@Override
	public HBPF constructEntity(final Object[] keyValues, final Object[] resultRow) {
		final HBPF entity = new HBPF();
		
		// Key members
		final Key_HBPF key = entity.get$key();
		assignKeyValues(key, keyValues);

		assignMemberValues(entity, resultRow);
		
		return entity;
	}
	
	@Override
	public Key_HBPF constructKey(final Object[] keyValues) {
		final Key_HBPF key = new Key_HBPF();
		assignKeyValues(key, keyValues);
		return key;
	}
	
	@Override
	public void assignKeyValues(final Object object, final Object[] resultRow) {
		final Key_HBPF result = (Key_HBPF)object;
		int index = 0;
		result.setHbcfl((java.lang.String)resultRow[index++]);
		result.setHblnm((java.lang.String)resultRow[index++]);
		result.setHbcfn((java.lang.String)resultRow[index++]);
	}
	
	@Override
	public void assignMemberValues(final Object object, final Object[] resultRow) {
		final HBPF result = (HBPF)object;
		int index = 0;
		result.setHbrnm((java.lang.String)resultRow[index++]);
		result.setMnt_in_bo((java.lang.String)resultRow[index++]);
	}

	@Override
	public Object[] getKeyMemberValues(final Object object) {
		final Key_HBPF entity = (Key_HBPF)object;
		final Object[] result = new Object[3];
		int index = 0;
		result[index++] = entity.getHbcfl();
		result[index++] = entity.getHblnm();
		result[index++] = entity.getHbcfn();
		return result;
	}

	@Override
	public Object[] getMemberValues(final Object object) {
		final HBPF entity = (HBPF)object;
		final Object[] result = new Object[2];
		int index = 0;
		result[index++] = entity.getHbrnm();
		result[index++] = entity.getMnt_in_bo();
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
		return (((HBPF)entity).get$key());
	}

}