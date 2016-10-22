package org.python.types;

public class Complex extends org.python.types.Object {
    public org.python.types.Float real;
    public org.python.types.Float imag;

    /**
     * A utility method to update the internal value of this object.
     *
     * Used by __i*__ operations to do an in-place operation.
     * obj must be of type org.python.types.Complex
     */

    public java.lang.Object toJava() {
        // return this.value;
        throw new org.python.exceptions.NotImplementedError("complex.toJava() has not been implemented.");
    }

    public org.python.Object byValue() {
        throw new org.python.exceptions.NotImplementedError("complex.byValue() has not been implemented.");
    }

    public int hashCode() {
        return this.hashCode();
    }

    public Complex(org.python.types.Float real_val, org.python.types.Float imagi_val) {
        super();
        this.real = real_val;
        this.imag = imagi_val;
    }

    public Complex(double imag) {
        this.real = new org.python.types.Float(0);
        this.imag = new org.python.types.Float(imag);
    }

    // public org.python.Object __new__() {
    //     throw new org.python.exceptions.NotImplementedError("bool.__new__() has not been implemented.");
    // }

    // public org.python.Object __init__() {
    //     throw new org.python.exceptions.NotImplementedError("bool.__init__() has not been implemented.");
    // }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.types.Str __repr__() {
        java.lang.StringBuilder buffer = new java.lang.StringBuilder();
        boolean real_present = true;
        if(this.real.value != 0) {
            buffer.append("(");
            if (((org.python.types.Bool)((this.real).__int__().__eq__(this.real))).value) {
                buffer.append((this.real).__int__().__repr__().value);
            } else {
                buffer.append((this.real).__repr__().value);
            }
        } else {
            real_present = false;
        }
        if(this.real.value != 0 && this.imag.value >= 0) {
            buffer.append("+");
        }
        if (((org.python.types.Bool)((this.imag).__int__().__eq__(this.imag))).value) {
            buffer.append((this.imag).__int__().__repr__().value);
        } else {
            buffer.append((this.imag).__repr__().value);
        }
        buffer.append("j");
        if(real_present) {
            buffer.append(")");
        }
        return new org.python.types.Str(buffer.toString());
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.types.Str __format__(org.python.Object format_string) {
        throw new org.python.exceptions.NotImplementedError("complex.__format__ has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __lt__(org.python.Object other) {
        throw new org.python.exceptions.TypeError("unorderable types: complex() < " + other.typeName() + "()");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __le__(org.python.Object other) {
        throw new org.python.exceptions.TypeError("unorderable types: complex() <= " + other.typeName() + "()");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __eq__(org.python.Object other) {
        if(other instanceof org.python.types.Complex) {
            org.python.types.Complex other_obj = (org.python.types.Complex) other;
            if(((org.python.types.Bool)this.real.__eq__(other_obj.real)).value && ((org.python.types.Bool)this.imag.__eq__(other_obj.imag)).value) {
                return new org.python.types.Bool(true);
            }
        } return new org.python.types.Bool(false);
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __ne__(org.python.Object other) {
        if (((org.python.types.Bool) this.__eq__((org.python.Object) other)).value) {
            return new org.python.types.Bool(false);
        }
        return new org.python.types.Bool(true);
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __gt__(org.python.Object other) {
        throw new org.python.exceptions.TypeError("unorderable types: complex() > " + other.typeName() + "()");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __ge__(org.python.Object other) {
        throw new org.python.exceptions.TypeError("unorderable types: complex() >= " + other.typeName() + "()");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.types.Bool __bool__() {
        throw new org.python.exceptions.NotImplementedError("complex.__bool__ has not been implemented.");
    }

    public boolean __setattr_null(java.lang.String name, org.python.Object value) {
        // Builtin types can't have attributes set on them.
        return false;
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.types.List __dir__() {
        throw new org.python.exceptions.NotImplementedError("complex.__dir__() has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )

    public org.python.Object __add__(org.python.Object other) {
        if (other instanceof org.python.types.Int || other instanceof org.python.types.Float) {
            return new org.python.types.Complex((org.python.types.Float)this.real.__add__(other), this.imag);
        } else if (other instanceof Bool) {
            return new org.python.types.Complex((org.python.types.Float)this.real.__add__(other), this.imag);
        } else if (other instanceof Complex) {
            org.python.types.Complex other_object = (org.python.types.Complex)other;
            return new org.python.types.Complex((org.python.types.Float)this.real.__add__(other_object.real), (org.python.types.Float)this.imag.__add__(other_object.imag));
        }
        throw new org.python.exceptions.TypeError("unsupported operand type(s) for +: 'complex' and '" + other.typeName() + "'");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __sub__(org.python.Object other) {
        if (other instanceof org.python.types.Int || other instanceof org.python.types.Float) {
            return new org.python.types.Complex((org.python.types.Float)this.real.__sub__(other), this.imag);
        } else if (other instanceof Bool) {
            return new org.python.types.Complex((org.python.types.Float)this.real.__sub__(other), this.imag);
        } else if (other instanceof Complex) {
            org.python.types.Complex other_object = (org.python.types.Complex)other;
            return new org.python.types.Complex((org.python.types.Float)this.real.__sub__(other_object.real), (org.python.types.Float)this.imag.__sub__(other_object.imag));
        }
        throw new org.python.exceptions.TypeError("unsupported operand type(s) for -: 'complex' and '" + other.typeName() + "'");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __mul__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("complex.__mul__ has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __truediv__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("complex.__truediv__() has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __floordiv__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("complex.__floordiv__ has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __mod__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("complex.__mod__ has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __divmod__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("complex.__divmod__ has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __pow__(org.python.Object other, org.python.Object modulo) {
        throw new org.python.exceptions.NotImplementedError("complex.__pow__ has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __lshift__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("complex.__lshift__ has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __rshift__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("complex.__rshift__ has not been implemented.");    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __and__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("complex.__and__ has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __xor__(org.python.Object other) {
        throw new org.python.exceptions.TypeError("unsupported operand type(s) for ^: 'complex' and '" + other.typeName() + "'");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __or__(org.python.Object other) {
        throw new org.python.exceptions.TypeError("unsupported operand type(s) for |: 'complex' and '" + other.typeName() + "'");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __radd__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("complex.__radd__() has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __rsub__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("complex.__rsub__() has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __rmul__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("complex.__rmul__() has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __rtruediv__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("complex.__rtruediv__() has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __rfloordiv__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("complex.__rfloordiv__() has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __rmod__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("complex.__rmod__() has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __rdivmod__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("complex.__rdivmod__() has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __rpow__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("complex.__rpow__() has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __rlshift__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("complex.__rlshift__() has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __rrshift__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("complex.__rrshift__() has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __rand__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("complex.__rand__() has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __rxor__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("complex.__rxor__() has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __ror__(org.python.Object other) {
        throw new org.python.exceptions.NotImplementedError("complex.__ror__() has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __neg__() {
        return new org.python.types.Complex((org.python.types.Float)this.real.__neg__(), (org.python.types.Float)this.imag.__neg__());
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __pos__() {
        return new org.python.types.Complex(this.real, this.imag);
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __abs__() {
        throw new org.python.exceptions.NotImplementedError("complex.__abs__ has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object __invert__() {
        throw new org.python.exceptions.TypeError("bad operand type for unary ~: 'complex'");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.types.Int __int__() {
        throw new org.python.exceptions.TypeError("can't convert complex to int");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.types.Float __float__() {
        throw new org.python.exceptions.NotImplementedError("complex.__float__ has not been implemented.");
    }

    @org.python.Method(
        __doc__ = ""
    )
    public org.python.Object conjugate() {
        throw new org.python.exceptions.NotImplementedError("complex.conjugate has not been implemented.");
    }
}
