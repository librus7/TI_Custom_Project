package com.misys.tiplus2.customisation.entity.persister;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.misys.tiplus2.persistent.EntityPersister;
import com.misys.tiplus2.customisation.entity.C5PF;
import com.misys.tiplus2.customisation.entity.C5PF.Key_C5PF;

@SuppressWarnings("unchecked")
public class C5PFPersister extends EntityPersister {

	// This code will be generated by the builder 
	
	public C5PFPersister() {
		setKeyMembers(new MemberDescriptor[] {
            new MemberDescriptor("c5atp", "C5PF.C5ATP", getBinderFactory().getBinderForType("String")),
		});
			
		setMembers(new MemberDescriptor[] {
            new MemberDescriptor("c5idbc", "C5PF.C5IDBC", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("c5idbd", "C5PF.C5IDBD", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("c5atd", "C5PF.C5ATD", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("c5sc46", "C5PF.C5SC46", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("c5sc47", "C5PF.C5SC47", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("c5vte", "C5PF.C5VTE", getBinderFactory().getBinderForType("String")),
            new MemberDescriptor("mnt_in_bo", "C5PF.MNT_IN_BO", getBinderFactory().getBinderForType("String")),
		});

		setForeignKeyMappings(new ForeignKeyMappingDescriptor[] {
		});
	}

    private static final String tableName = "C5PF";

    /**
     * Gets the table name - in this case C5PF
     * <p>
     * Note that the <i>schema</i> must be prefixed to this when constructing
     * SQL statements, for example: <code>schema.C5PF</code>
     * 
     * @return the table name
     */
	@Override
	public String getTableName() {       
		return tableName;
	}

	@Override
	public Class<?> getEntityClass() {
		return C5PF.class;
	}

	public Class<?> getKeyClass() {
		return Key_C5PF.class;
	}

	@Override
	public C5PF constructEntity(final Object[] keyValues, final Object[] resultRow) {
		final C5PF entity = new C5PF();
		
		// Key members
		final Key_C5PF key = entity.get$key();
		assignKeyValues(key, keyValues);

		assignMemberValues(entity, resultRow);
		
		return entity;
	}
	
	@Override
	public Key_C5PF constructKey(final Object[] keyValues) {
		final Key_C5PF key = new Key_C5PF();
		assignKeyValues(key, keyValues);
		return key;
	}
	
	@Override
	public void assignKeyValues(final Object object, final Object[] resultRow) {
		final Key_C5PF result = (Key_C5PF)object;
		int index = 0;
		result.setC5atp((java.lang.String)resultRow[index++]);
	}
	
	@Override
	public void assignMemberValues(final Object object, final Object[] resultRow) {
		final C5PF result = (C5PF)object;
		int index = 0;
		result.setC5idbc((java.lang.String)resultRow[index++]);
		result.setC5idbd((java.lang.String)resultRow[index++]);
		result.setC5atd((java.lang.String)resultRow[index++]);
		result.setC5sc46((java.lang.String)resultRow[index++]);
		result.setC5sc47((java.lang.String)resultRow[index++]);
		result.setC5vte((java.lang.String)resultRow[index++]);
		result.setMnt_in_bo((java.lang.String)resultRow[index++]);
	}

	@Override
	public Object[] getKeyMemberValues(final Object object) {
		final Key_C5PF entity = (Key_C5PF)object;
		final Object[] result = new Object[1];
		int index = 0;
		result[index++] = entity.getC5atp();
		return result;
	}

	@Override
	public Object[] getMemberValues(final Object object) {
		final C5PF entity = (C5PF)object;
		final Object[] result = new Object[7];
		int index = 0;
		result[index++] = entity.getC5idbc();
		result[index++] = entity.getC5idbd();
		result[index++] = entity.getC5atd();
		result[index++] = entity.getC5sc46();
		result[index++] = entity.getC5sc47();
		result[index++] = entity.getC5vte();
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
		return (((C5PF)entity).get$key());
	}

}
