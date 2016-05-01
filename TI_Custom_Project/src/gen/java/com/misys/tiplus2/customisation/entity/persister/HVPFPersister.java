package com.misys.tiplus2.customisation.entity.persister;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.misys.tiplus2.persistent.EntityPersister;
import com.misys.tiplus2.customisation.entity.HVPF;
import com.misys.tiplus2.customisation.entity.HVPF.Key_HVPF;

@SuppressWarnings("unchecked")
public class HVPFPersister extends EntityPersister {

	// This code will be generated by the builder 
	
	public HVPFPersister() {
		setKeyMembers(new MemberDescriptor[] {
            new MemberDescriptor("hvbrnm", "HVPF.HVBRNM", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("hvlnm", "HVPF.HVLNM", getBinderFactory().getBinderForType("String")),
		});
			
		setMembers(new MemberDescriptor[] {
            new MemberDescriptor("city", "HVPF.CITY", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("mnt_in_bo", "HVPF.MNT_IN_BO", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("hvbadff", "HVPF.HVBADFF", getBinderFactory().getBinderForType("LongVarchar")),
            new MemberDescriptor("hvbad2", "HVPF.HVBAD2", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("hvbad3", "HVPF.HVBAD3", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("hvbad4", "HVPF.HVBAD4", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("hvbad5", "HVPF.HVBAD5", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("hvbad1", "HVPF.HVBAD1", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("zipcode", "HVPF.ZIPCODE", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("hvbnm", "HVPF.HVBNM", getBinderFactory().getBinderForType("String")),
		});

		setForeignKeyMappings(new ForeignKeyMappingDescriptor[] {
		});
	}

    private static final String tableName = "HVPF";

    /**
     * Gets the table name - in this case HVPF
     * <p>
     * Note that the <i>schema</i> must be prefixed to this when constructing
     * SQL statements, for example: <code>schema.HVPF</code>
     * 
     * @return the table name
     */
	@Override
	public String getTableName() {       
		return tableName;
	}

	@Override
	public Class<?> getEntityClass() {
		return HVPF.class;
	}

	public Class<?> getKeyClass() {
		return Key_HVPF.class;
	}

	@Override
	public HVPF constructEntity(final Object[] keyValues, final Object[] resultRow) {
		final HVPF entity = new HVPF();
		
		// Key members
		final Key_HVPF key = entity.get$key();
		assignKeyValues(key, keyValues);

		assignMemberValues(entity, resultRow);
		
		return entity;
	}
	
	@Override
	public Key_HVPF constructKey(final Object[] keyValues) {
		final Key_HVPF key = new Key_HVPF();
		assignKeyValues(key, keyValues);
		return key;
	}
	
	@Override
	public void assignKeyValues(final Object object, final Object[] resultRow) {
		final Key_HVPF result = (Key_HVPF)object;
		int index = 0;
		result.setHvbrnm((java.lang.String)resultRow[index++]);
		result.setHvlnm((java.lang.String)resultRow[index++]);
	}
	
	@Override
	public void assignMemberValues(final Object object, final Object[] resultRow) {
		final HVPF result = (HVPF)object;
		int index = 0;
		result.setCity((java.lang.String)resultRow[index++]);
		result.setMnt_in_bo((java.lang.String)resultRow[index++]);
		result.setHvbadff((java.lang.String)resultRow[index++]);
		result.setHvbad2((java.lang.String)resultRow[index++]);
		result.setHvbad3((java.lang.String)resultRow[index++]);
		result.setHvbad4((java.lang.String)resultRow[index++]);
		result.setHvbad5((java.lang.String)resultRow[index++]);
		result.setHvbad1((java.lang.String)resultRow[index++]);
		result.setZipcode((java.lang.String)resultRow[index++]);
		result.setHvbnm((java.lang.String)resultRow[index++]);
	}

	@Override
	public Object[] getKeyMemberValues(final Object object) {
		final Key_HVPF entity = (Key_HVPF)object;
		final Object[] result = new Object[2];
		int index = 0;
		result[index++] = entity.getHvbrnm();
		result[index++] = entity.getHvlnm();
		return result;
	}

	@Override
	public Object[] getMemberValues(final Object object) {
		final HVPF entity = (HVPF)object;
		final Object[] result = new Object[10];
		int index = 0;
		result[index++] = entity.getCity();
		result[index++] = entity.getMnt_in_bo();
		result[index++] = entity.getHvbadff();
		result[index++] = entity.getHvbad2();
		result[index++] = entity.getHvbad3();
		result[index++] = entity.getHvbad4();
		result[index++] = entity.getHvbad5();
		result[index++] = entity.getHvbad1();
		result[index++] = entity.getZipcode();
		result[index++] = entity.getHvbnm();
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
		return (((HVPF)entity).get$key());
	}

}