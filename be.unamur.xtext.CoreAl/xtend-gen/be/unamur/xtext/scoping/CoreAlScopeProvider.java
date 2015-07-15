package be.unamur.xtext.scoping;

import be.unamur.xtext.coreAl.Reference;
import be.unamur.xtext.coreAl.ReferenceableType;
import be.unamur.xtext.coreAl.ReferenceableTypeReference;
import be.unamur.xtext.utils.CoreAlModelUtils;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;

@SuppressWarnings("all")
public class CoreAlScopeProvider {
  public IScope scope_opposite(final Reference context, final EReference ref) {
    ReferenceableTypeReference _type = context.getType();
    final ReferenceableType type = _type.getType();
    boolean _matched = false;
    if (!_matched) {
      if (type instanceof be.unamur.xtext.coreAl.Class) {
        _matched=true;
        Iterable<Reference> _references = CoreAlModelUtils.references(((be.unamur.xtext.coreAl.Class)type));
        return Scopes.scopeFor(_references, IScope.NULLSCOPE);
      }
    }
    return null;
  }
}
