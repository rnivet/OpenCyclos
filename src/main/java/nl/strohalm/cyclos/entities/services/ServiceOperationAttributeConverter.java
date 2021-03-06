package nl.strohalm.cyclos.entities.services;

import nl.strohalm.cyclos.entities.converters.StringValuedEnumAttributeConverter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class ServiceOperationAttributeConverter extends StringValuedEnumAttributeConverter<ServiceOperation> implements AttributeConverter<ServiceOperation, String> {
}
