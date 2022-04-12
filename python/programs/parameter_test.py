import pytest


@pytest.mark.parametrize("x,y,z", [(10, 20, 200)])
def test_multiplication1(x, y, z):
    assert x * y == z


