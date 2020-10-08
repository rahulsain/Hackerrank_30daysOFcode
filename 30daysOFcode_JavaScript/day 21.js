class BaseClass {
  hello = function () {
    console.log("hello!");
  };
}

function GenericClass(T, Base) {
  return class extends Base {
    field = new T();
  };
}

class DerivedFromGeneric extends GenericClass(Array, BaseClass) {
  greet = function () {
    this.hello();
    console.log("greetings ", this.field);
  };
}

let i = new DerivedFromGeneric();
i.greet();
